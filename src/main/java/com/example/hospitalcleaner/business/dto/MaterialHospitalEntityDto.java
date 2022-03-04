package com.example.hospitalcleaner.business.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class MaterialHospitalEntityDto implements Serializable {
    private final int id;
    private final int materialId;
    private final String materialName;
    private final int hospitalId;
    private final String hospitalName;
    private final String hospitalAddress;
    private final int quantity;
    private final LocalDate expiryDate;
}
