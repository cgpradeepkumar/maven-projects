package com.infosat.chatbot.service;

import com.infosat.chatbot.model.Chat;
import com.infosat.chatbot.model.Message;
import com.infosat.chatbot.model.Reply;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ChatbotServiceTest {

    @Autowired
    private ChatbotService chatbotService;

    @Test
    public void testSend() {
        Assert.assertNotNull(chatbotService);
        Chat chat = new Chat();
        chat.setMessage("Hi");
        chat = chatbotService.send(chat);
        Assert.assertNotNull(chat.getReply());
    }
}
