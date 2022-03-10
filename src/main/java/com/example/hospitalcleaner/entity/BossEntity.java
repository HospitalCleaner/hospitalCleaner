package com.example.hospitalcleaner.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "boss_id")
@Table(name = "boss")
public class BossEntity extends UserEntity {


    private String deneme;

    @OneToMany(mappedBy = "boss")
    private List<CleanerEntity> cleaners;


    public BossEntity(){

    }

    public BossEntity(int id, String name, String surName, String email, String password, String number, String deneme) {
        super(id, name, surName, email, password, number);
        this.deneme = deneme;
    }

    public BossEntity(String deneme) {
        this.deneme = deneme;
    }

    public String getDeneme() {
        return deneme;
    }

    public void setDeneme(String deneme) {
        this.deneme = deneme;
    }




}
