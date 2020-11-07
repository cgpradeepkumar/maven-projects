package com.infosat.chatbot.service;

import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.cloud.dialogflow.v2.*;
import com.infosat.chatbot.model.Chat;
import com.infosat.chatbot.model.Message;
import com.infosat.chatbot.model.Reply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Service
public class ChatbotService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChatbotService.class);
    private SessionsSettings sessionsSettings;
    private String projectId;
    private String languageCode = "en-US";

    public ChatbotService() {
        try {
            File file = ResourceUtils.getFile("classpath:bikerepair-retc-d2914ce5d4b5.json");
            InputStream stream = new FileInputStream(file);
            GoogleCredentials credentials = GoogleCredentials.fromStream(stream);
            projectId = ((ServiceAccountCredentials) credentials).getProjectId();
            LOGGER.info("project id = {}", projectId);

            SessionsSettings.Builder settingsBuilder = SessionsSettings.newBuilder();
            sessionsSettings = settingsBuilder.setCredentialsProvider(FixedCredentialsProvider.create(credentials)).build();
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            LOGGER.error(e.getStackTrace().toString());
        }
    }

    public Chat send(Chat chat) {
        try (SessionsClient sessionsClient = SessionsClient.create(sessionsSettings)) {
            if (StringUtils.isEmpty(chat.getSessionId())) {
                UUID sessionId = UUID.randomUUID();
                chat.setSessionId(sessionId.toString());
            }
            SessionName session = SessionName.of(projectId, chat.getSessionId());
            String text = chat.getMessage();
            TextInput.Builder textInput = TextInput.newBuilder().setText(text).setLanguageCode(languageCode);

            QueryInput queryInput = QueryInput.newBuilder().setText(textInput).build();
            DetectIntentResponse response = sessionsClient.detectIntent(session, queryInput);

            QueryResult result = response.getQueryResult();
            LOGGER.info("User says: {}", result.getQueryText());
            LOGGER.info("Bot says: {}", result.getFulfillmentText());
            chat.setReply(result.getFulfillmentText());
            return chat;
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
            LOGGER.error(e.getStackTrace().toString());
        }
        return null;
    }
}
