package com.infosat.chatbot.controller;

import com.infosat.chatbot.model.Chat;
import com.infosat.chatbot.model.Message;
import com.infosat.chatbot.model.Reply;
import com.infosat.chatbot.service.ChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatbotController {

    @Autowired
    private ChatbotService chatbotService;

    @PostMapping("/send")
    public ResponseEntity<Chat> send(@RequestBody Chat chat) {
        chat = chatbotService.send(chat);
        if (chat.getReply() != null) {
            return new ResponseEntity<>(chat, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
