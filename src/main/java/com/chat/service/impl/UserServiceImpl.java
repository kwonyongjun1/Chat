package com.chat.service.impl;

import com.chat.mapper.UserMapper;
import com.chat.service.UserService;
import com.chat.vo.ChatVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    /**
     * 유저 등록
     */
    @Override
    public int registerUser(ChatVO chatVO) {

        /**
         * 유저 정보 조회
         */
        List<ChatVO> hi = userMapper.selectUserInfo(chatVO);


        return 0;
    }
}
