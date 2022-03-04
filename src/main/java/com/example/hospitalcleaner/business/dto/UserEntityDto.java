package com.example.hospitalcleaner.business.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserEntityDto implements Serializable {
    private final String name;
    private final String surName;
    private final String email;
    private final String password;
    private final String number;
}
