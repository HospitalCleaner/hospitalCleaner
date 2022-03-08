package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class FeedbackEntityURequest implements Serializable {
    private int isActive;
    private int id;
    private int roomId;
    private String description;
    private int star;


    public FeedbackEntityURequest(int isActive, int id, int roomId, String description, int star) {
        this.isActive = isActive;
        this.id = id;
        this.roomId = roomId;
        this.description = description;
        this.star = star;
    }

    public FeedbackEntityURequest() {
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

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }
}
