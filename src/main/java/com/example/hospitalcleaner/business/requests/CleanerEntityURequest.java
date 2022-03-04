package com.example.hospitalcleaner.business.requests;

import lombok.Data;

import java.io.Serializable;

@Data
public class CleanerEntityURequest implements Serializable {
    private final int isActive;
    private final int id;
    private final String name;
    private final String surName;
    private final String email;
    private final String password;
    private final String number;
    private final int bossId;
}
