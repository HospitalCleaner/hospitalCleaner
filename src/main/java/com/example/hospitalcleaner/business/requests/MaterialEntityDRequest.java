package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class MaterialEntityDRequest implements Serializable {
    private  int id;

    public MaterialEntityDRequest(int id) {
        this.id = id;
    }

    public MaterialEntityDRequest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
