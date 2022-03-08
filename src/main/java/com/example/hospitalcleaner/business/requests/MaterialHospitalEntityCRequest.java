package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;


public class MaterialHospitalEntityCRequest implements Serializable {
    private  int materialId;
    private  int hospitalId;
    private  int quantity;
    private  LocalDate expiryDate;

    public MaterialHospitalEntityCRequest(int materialId, int hospitalId, int quantity, LocalDate expiryDate) {
        this.materialId = materialId;
        this.hospitalId = hospitalId;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    public MaterialHospitalEntityCRequest() {
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
