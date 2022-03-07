package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class FeedbackEntityURequest implements Serializable {
    private int isActive;
    private int id;
    private int roomId;
    private String description;
    private int star;
}
