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
        registry.enableSimpleBroker("/sub"); // 메세지를 받을 때, 경로를 설정해주는 함수
        registry.setApplicationDestinationPrefixes("/pub"); // 메세지를 보낼 때, 관련 경로를 설정
    }
}
