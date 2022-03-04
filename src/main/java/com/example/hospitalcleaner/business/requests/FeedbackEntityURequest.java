package com.example.hospitalcleaner.business.requests;

import lombok.Data;

import java.io.Serializable;

@Data
public class FeedbackEntityURequest implements Serializable {
    private final int isActive;
    private final int id;
    private final int roomId;
    private final String description;
    private final int star;
}
