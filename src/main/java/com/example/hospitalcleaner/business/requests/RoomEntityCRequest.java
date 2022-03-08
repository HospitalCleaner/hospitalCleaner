package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class RoomEntityCRequest implements Serializable {
    private  String roomName;
    private  int cleanerId;
    private  int hospitalId;

    public RoomEntityCRequest(String roomName, int cleanerId, int hospitalId) {
        this.roomName = roomName;
        this.cleanerId = cleanerId;
        this.hospitalId = hospitalId;
    }

    public RoomEntityCRequest() {
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
