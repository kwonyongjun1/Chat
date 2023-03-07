package com.chat.service.impl;
import com.chat.mapper.ChatMapper;
import com.chat.mapper.UserMapper;
import com.chat.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("chatService")
public class ChatServiceImpl implements ChatService {

    @Autowired
    private ChatMapper chatMapper;

    @Override
    public String getTest() {
        String a = chatMapper.getTest();

        return a;
    }
}
