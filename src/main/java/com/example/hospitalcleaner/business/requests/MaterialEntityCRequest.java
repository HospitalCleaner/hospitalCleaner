package com.example.hospitalcleaner.business.requests;

import lombok.Data;

import java.io.Serializable;

@Data
public class MaterialEntityCRequest implements Serializable {
    private final String name;
}
