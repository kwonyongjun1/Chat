package com.chat.controller;

import com.chat.vo.ChatMessageVO;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MessageController {

    private final SimpMessagingTemplate simpMessagingTemplate;
    // /pub
    @MessageMapping("/chat/message")
    public void message(ChatMessageVO chatMessageVO){
        //chatMessagevo.setMessageContent("누군가 입장했다.");
        simpMessagingTemplate.convertAndSend("/sub/room/" + chatMessageVO.getChatRoomId(), chatMessageVO);

        // TODO 방 생성 중 끝남 . 상황 WebSocket -> WebSocket + STOMP
    }
}
