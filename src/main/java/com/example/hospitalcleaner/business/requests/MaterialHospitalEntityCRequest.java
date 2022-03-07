package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class MaterialHospitalEntityCRequest implements Serializable {
    private  int materialId;
    private  int hospitalId;
    private  int quantity;
    private  LocalDate expiryDate;
}
