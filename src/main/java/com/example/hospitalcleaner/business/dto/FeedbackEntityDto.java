package com.example.hospitalcleaner.business.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class FeedbackEntityDto implements Serializable {
    private  int id;
    private  int roomId;
    private  String description;
    private  int star;

    public FeedbackEntityDto(int id, int roomId, String description, int star) {
        this.id = id;
        this.roomId = roomId;
        this.description = description;
        this.star = star;
    }

    public FeedbackEntityDto() {
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
