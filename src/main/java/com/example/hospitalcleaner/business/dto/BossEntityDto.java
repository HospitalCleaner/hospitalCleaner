package com.example.hospitalcleaner.business.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class BossEntityDto implements Serializable {
    private  String name;
    private  String surName;
    private  String email;
    private  String number;
    private String deneme;

    public BossEntityDto(String name, String surName, String email, String number, String deneme) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.number = number;
        this.deneme = deneme;
    }

    public BossEntityDto() {
    }

    public String getDeneme() {
        return deneme;
    }

    public void setDeneme(String deneme) {
        this.deneme = deneme;
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
