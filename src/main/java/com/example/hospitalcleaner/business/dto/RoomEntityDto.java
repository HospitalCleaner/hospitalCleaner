package com.example.hospitalcleaner.business.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoomEntityDto implements Serializable {
    private final int id;
    private final String roomName;
}
