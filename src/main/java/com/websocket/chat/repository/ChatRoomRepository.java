package com.websocket.chat.repository;

import com.websocket.chat.dto.ChatRoomV2;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class ChatRoomRepository {

    private Map<String, ChatRoomV2> chatRoomMap;

    @PostConstruct
    private void init() {
        chatRoomMap = new LinkedHashMap<>();
    }

    public List<ChatRoomV2> findAllRoom() {
        ArrayList<ChatRoomV2> chatRooms = new ArrayList<>(chatRoomMap.values());
        Collections.reverse(chatRooms);
        return chatRooms;
    }

    public ChatRoomV2 findRoomById(String id) {
        return chatRoomMap.get(id);
    }

    public ChatRoomV2 createChatRoom(String name) {
        ChatRoomV2 chatRoom = ChatRoomV2.create(name);
        chatRoomMap.put(chatRoom.getRoomId(), chatRoom);
        return chatRoom;
    }
}
