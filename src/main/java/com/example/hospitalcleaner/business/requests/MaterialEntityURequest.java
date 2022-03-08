package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class MaterialEntityURequest implements Serializable {
    private  int isActive;
    private  int id;
    private  String name;

    public MaterialEntityURequest(int isActive, int id, String name) {
        this.isActive = isActive;
        this.id = id;
        this.name = name;
    }

    public MaterialEntityURequest() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
