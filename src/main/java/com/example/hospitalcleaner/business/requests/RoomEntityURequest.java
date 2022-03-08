package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class RoomEntityURequest implements Serializable {
    private  int isActive;
    private  int id;
    private  String roomName;
    private  int cleanerId;
    private  int hospitalId;

    public RoomEntityURequest(int isActive, int id, String roomName, int cleanerId, int hospitalId) {
        this.isActive = isActive;
        this.id = id;
        this.roomName = roomName;
        this.cleanerId = cleanerId;
        this.hospitalId = hospitalId;
    }

    public RoomEntityURequest() {
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
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
