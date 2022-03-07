package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class FeedbackEntityCRequest implements Serializable {
    private int roomId;
    private String description;
    private int star;

    public FeedbackEntityCRequest(int roomId, String description, int star) {
        this.roomId = roomId;
        this.description = description;
        this.star = star;
    }

    public FeedbackEntityCRequest() {
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
