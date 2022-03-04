package com.example.hospitalcleaner.business.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class FeedbackEntityDto implements Serializable {
    private final int id;
    private final int roomId;
    private final String description;
    private final int star;
}
