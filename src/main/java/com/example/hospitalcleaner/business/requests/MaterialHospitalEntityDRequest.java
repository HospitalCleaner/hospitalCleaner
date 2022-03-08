package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class MaterialHospitalEntityDRequest implements Serializable {
    private  int id;

    public MaterialHospitalEntityDRequest(int id) {
        this.id = id;
    }

    public MaterialHospitalEntityDRequest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
