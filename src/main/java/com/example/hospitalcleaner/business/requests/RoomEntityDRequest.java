package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class RoomEntityDRequest implements Serializable {
    private  int id;

    public RoomEntityDRequest(int id) {
        this.id = id;
    }

    public RoomEntityDRequest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
