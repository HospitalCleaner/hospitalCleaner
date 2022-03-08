package com.example.hospitalcleaner.business.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class RoomEntityDto implements Serializable {
    private  int id;
    private  String roomName;

    private int cleanerId;

    private int hospitalId;



    public RoomEntityDto(int id, String roomName, int cleanerId, int hospitalId ) {
        this.id = id;
        this.roomName = roomName;
        this.cleanerId=cleanerId;
        this.hospitalId=hospitalId;
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

    public int getCleanerId() {
        return cleanerId;
    }

    public void setCleanerId(int cleanerId) {
        this.cleanerId = cleanerId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }
}
