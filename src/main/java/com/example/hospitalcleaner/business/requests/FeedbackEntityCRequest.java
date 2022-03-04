package com.example.hospitalcleaner.business.requests;

import lombok.Data;

import java.io.Serializable;

@Data
public class FeedbackEntityCRequest implements Serializable {
    private final int roomId;
    private final String description;
    private final int star;
}
