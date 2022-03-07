package com.example.hospitalcleaner.business.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;


public class MaterialHospitalEntityDto implements Serializable {
    private  int id;
    private  int materialId;
    private  String materialName;
    private  int hospitalId;
    private  String hospitalName;
    private  String hospitalAddress;
    private  int quantity;
    private  LocalDate expiryDate;

    public MaterialHospitalEntityDto(int id, int materialId, String materialName, int hospitalId, String hospitalName, String hospitalAddress, int quantity, LocalDate expiryDate) {
        this.id = id;
        this.materialId = materialId;
        this.materialName = materialName;
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    public MaterialHospitalEntityDto() {
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

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
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
