package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class HospitalEntityURequest implements Serializable {
    private  int isActive;
    private  int id;
    private  String name;
    private  String address;


    public HospitalEntityURequest(int isActive, int id, String name, String address) {
        this.isActive = isActive;
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public HospitalEntityURequest() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
