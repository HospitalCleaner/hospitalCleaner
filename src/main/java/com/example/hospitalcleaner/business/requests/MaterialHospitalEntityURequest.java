package com.example.hospitalcleaner.business.requests;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class MaterialHospitalEntityURequest implements Serializable {
    private final int isActive;
    private final int id;
    private final int materialId;
    private final int hospitalId;
    private final int quantity;
    private final LocalDate expiryDate;
}
