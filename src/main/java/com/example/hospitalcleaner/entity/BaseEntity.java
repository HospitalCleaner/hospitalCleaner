package com.example.hospitalcleaner.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {

    @Column(name = "is_active")
    private int isActive = 1; //2 delete 1 active 0 passive

    public BaseEntity(int isActive) {
        this.isActive = isActive;
    }

    public BaseEntity() {

    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }
}
