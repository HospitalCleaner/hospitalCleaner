package com.example.hospitalcleaner.business.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class MaterialEntityDto implements Serializable {
    private  int id;
    private  String name;

    public MaterialEntityDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public MaterialEntityDto() {
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
