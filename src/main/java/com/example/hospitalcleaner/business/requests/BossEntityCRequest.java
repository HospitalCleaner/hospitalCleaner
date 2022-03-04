package com.example.hospitalcleaner.business.requests;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class BossEntityCRequest implements Serializable {
    private final String name;
    private final String surName;
    private final String email;
    private final String password;
    private final String number;
}
