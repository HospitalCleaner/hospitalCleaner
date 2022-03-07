package com.example.hospitalcleaner.business.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class HospitalEntityDto implements Serializable {
    private  String name;
    private  String address;

    public HospitalEntityDto(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public HospitalEntityDto() {

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
