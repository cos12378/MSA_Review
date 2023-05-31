package com.websocket.chat.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ChatRoomV2 {
    private String roomId;
    private String name;

    public static ChatRoomV2 create(String name) {
        ChatRoomV2 chatRoom = new ChatRoomV2();
        chatRoom.roomId = UUID.randomUUID().toString();
        chatRoom.name = name;
        return chatRoom;
    }
}
