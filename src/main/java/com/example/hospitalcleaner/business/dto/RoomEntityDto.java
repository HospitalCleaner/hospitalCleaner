package com.example.hospitalcleaner.business.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class RoomEntityDto implements Serializable {
    private  int id;
    private  String roomName;

    public RoomEntityDto(int id, String roomName) {
        this.id = id;
        this.roomName = roomName;
    }

    public RoomEntityDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
