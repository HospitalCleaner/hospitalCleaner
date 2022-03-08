package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

public class MaterialHospitalEntityURequest implements Serializable {
    private  int isActive;
    private  int id;
    private  int materialId;
    private  int hospitalId;
    private  int quantity;
    private  LocalDate expiryDate;

    public MaterialHospitalEntityURequest(int isActive, int id, int materialId, int hospitalId, int quantity, LocalDate expiryDate) {
        this.isActive = isActive;
        this.id = id;
        this.materialId = materialId;
        this.hospitalId = hospitalId;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    public MaterialHospitalEntityURequest() {
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
