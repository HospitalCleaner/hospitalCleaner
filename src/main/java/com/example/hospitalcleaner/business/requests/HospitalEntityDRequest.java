package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class HospitalEntityDRequest implements Serializable {
    private  int id;

    public HospitalEntityDRequest(int id) {
        this.id = id;
    }

    public HospitalEntityDRequest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
