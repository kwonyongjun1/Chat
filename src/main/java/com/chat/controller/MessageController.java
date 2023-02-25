package com.chat.controller;

import com.chat.vo.ChatMessageVO;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@RequiredArgsConstructor
public class MessageController {

    private final SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("pub/chat/message")
    public void enterChatRoom(ChatMessageVO chatMessagevo){
        chatMessagevo.setMessageContent("누군가 입장했다.");
        simpMessagingTemplate.convertAndSend("/sub/chat/");

        // TODO 방 생성 중 끝남 . 상황 WebSocket -> WebSocket + STOMP

    }
}
