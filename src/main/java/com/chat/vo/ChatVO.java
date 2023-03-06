package com.chat.vo;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
@Repository
public class ChatVO {
    /* 사용자 ID  */
    private String userId;

    /* 사용자 이름 */
    private String userNm;

    /* 채팅방 id  */
    private String roomId;

    /*  채팅방 이름  */
    private String roomNm;

    /*  보낸사람   */
    private String senderNm;

    /*  채팅내용   */
    private String message;
}
