package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class MaterialEntityCRequest implements Serializable {
    private  String name;

    public MaterialEntityCRequest(String name) {
        this.name = name;
    }

    public MaterialEntityCRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
