package com.chat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")

public class ChatController {

    @GetMapping("/room")
    public String create()
    {
        return "GD HELLO!!";

    }

}
