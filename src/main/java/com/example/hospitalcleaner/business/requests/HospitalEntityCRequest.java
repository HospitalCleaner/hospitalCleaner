package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class HospitalEntityCRequest implements Serializable {
    private  String name;
    private  String address;

    public HospitalEntityCRequest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public HospitalEntityCRequest() {

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
