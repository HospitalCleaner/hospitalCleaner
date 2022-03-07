package com.example.hospitalcleaner.business.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class CleanerEntityDto implements Serializable {
    private  String name;
    private  String surName;
    private  String email;
    private  String number;

    public CleanerEntityDto(String name, String surName, String email, String number) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.number = number;
    }

    public CleanerEntityDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
