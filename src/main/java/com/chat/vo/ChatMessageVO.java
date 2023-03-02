package com.chat.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // getter, setter 자동 생성
@AllArgsConstructor // 생성자를 자동 생성
public class ChatMessageVO {

    private String ChatRoomId;

    // 유저의 이름을 저장하기 위한 변수
    private String userName;

    // 메시지의 내용을 저장하기 위한 변수
    private String messageContent;


}
