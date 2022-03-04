package com.example.hospitalcleaner.business.requests;

import lombok.Data;

import java.io.Serializable;

@Data
public class HospitalEntityCRequest implements Serializable {
    private final String name;
    private final String address;
}
