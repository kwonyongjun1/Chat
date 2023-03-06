package com.chat.mapper;

import com.chat.vo.ChatVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    /**
     * 유저정보 조회
     * @return
     */
    List<ChatVO> selectUserInfo();

    /**
     * 유저정보 등록
     * @param userVO
     * @return
     */
    int insertUserInfo(ChatVO userVO);

    /**
     * 유저정보 삭제
     * @param userVO
     * @return
     */
    int deleteUserInfo(ChatVO userVO);

    /**
     * 유저정보 수정
     * @param userVO
     * @return
     */
    int updateUserInfo(ChatVO userVO);

}
