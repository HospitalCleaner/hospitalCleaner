package com.example.hospitalcleaner.business.requests;

import lombok.Data;

import java.io.Serializable;

@Data
public class MaterialEntityURequest implements Serializable {
    private final int isActive;
    private final int id;
    private final String name;
}
