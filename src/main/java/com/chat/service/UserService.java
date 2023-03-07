package com.chat.service;

import com.chat.vo.ChatVO;

public interface UserService {

    /**
     * 유저 등록
     */
    int registerUser(ChatVO chatVO);

}
