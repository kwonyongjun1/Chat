package com.chat.mapper;

import com.chat.vo.ChatVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ChatRoomMapper {

    /**
     * 채팅방 조회
     * @return
     */
    List<ChatVO> selectChatRoom();

    /**
     * 채팅방 생성
     * @return
     */
    int insertChatRoom();

    /**
     * 채팅방 삭제
     * @return
     */
    int deleteChatRoomRel();

    int deleteChatRoom();

    /**
     * 채팅 내용 저장
     * @return
     */
    int insertMessage();

}
