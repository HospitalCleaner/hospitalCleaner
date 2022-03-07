package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class HospitalEntityCRequest implements Serializable {
    private  String name;
    private  String address;
}
