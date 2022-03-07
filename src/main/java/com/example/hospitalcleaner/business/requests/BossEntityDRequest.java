package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class BossEntityDRequest implements Serializable {
    private int id;

    public BossEntityDRequest(int id) {
        this.id = id;
    }

    public BossEntityDRequest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
