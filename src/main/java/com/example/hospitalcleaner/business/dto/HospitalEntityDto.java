package com.example.hospitalcleaner.business.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class HospitalEntityDto implements Serializable {
    private final String name;
    private final String address;
}
