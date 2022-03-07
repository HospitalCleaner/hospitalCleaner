package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


public class BossEntityCRequest {
    private String name;
    private String surName;
    private String email;
    private String password;
    private String number;

    public BossEntityCRequest(String name, String surName, String email, String password, String number, String deneme) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.number = number;
        this.deneme = deneme;
    }

    public BossEntityCRequest() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDeneme() {
        return deneme;
    }

    public void setDeneme(String deneme) {
        this.deneme = deneme;
    }

    private String deneme;
}
