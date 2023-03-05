package com.chat.controller;

import com.chat.service.ChatService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@CrossOrigin("*")
@Controller("chatController")
@RequestMapping("/message")
public class ChatController {

    @Resource(name = "chatService")
    private ChatService chatService;

    @GetMapping("/test")
    public String test() {
        String a = chatService.test();
        return a;
    }

}
