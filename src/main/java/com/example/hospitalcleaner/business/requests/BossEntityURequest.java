package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class BossEntityURequest implements Serializable {
    private  int isActive;
    private  int id;
    private  String name;
    private  String surName;
    private  String email;
    private  String password;
    private  String number;

    public BossEntityURequest(int isActive, int id, String name, String surName, String email, String password, String number) {
        this.isActive = isActive;
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.number = number;
    }

    public BossEntityURequest() {
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
}
