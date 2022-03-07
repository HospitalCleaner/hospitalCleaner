package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class CleanerEntityDRequest implements Serializable {
    private  int id;

    public CleanerEntityDRequest(int id) {
        this.id = id;
    }

    public CleanerEntityDRequest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
