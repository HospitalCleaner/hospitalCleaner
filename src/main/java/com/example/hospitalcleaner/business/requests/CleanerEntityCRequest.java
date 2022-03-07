package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


public class CleanerEntityCRequest implements Serializable {
    private  String name;
    private  String surName;
    private  String email;
    private  String password;
    private  String number;
    private  int bossId;

    public CleanerEntityCRequest(String name, String surName, String email, String password, String number, int bossId) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.number = number;
        this.bossId = bossId;
    }

    public CleanerEntityCRequest() {
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

    public int getBossId() {
        return bossId;
    }

    public void setBossId(int bossId) {
        this.bossId = bossId;
    }
}
