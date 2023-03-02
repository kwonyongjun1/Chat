package com.chat.config;

import com.chat.handler.SocketHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Autowired
    SocketHandler socketHandler;

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry){
        registry.addEndpoint("/api/chat")
                .setAllowedOriginPatterns("*") // CORS 설정을 해주어야 한다.
                .withSockJS(); // sockJS 소켓을 지원하지 않는 브라우저 때문
            }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // 메세지를 받을 때, 경로를 설정해주는 함수
        //prefix(api 경로 맨 앞)에 붙은 경우, messageBroker가 잡아서 해당 채팅방을 구독하고 있는 클라이언트에게 메시지를 전달해줌
        registry.enableSimpleBroker("/sub");
        registry.setApplicationDestinationPrefixes("/pub"); // 메세지를 보낼 때, 관련 경로를 설정
    }
}
