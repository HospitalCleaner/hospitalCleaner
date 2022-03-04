package com.example.hospitalcleaner.business.requests;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoomEntityURequest implements Serializable {
    private final int isActive;
    private final int id;
    private final String roomName;
    private final int cleanerId;
    private final int hospitalId;
}
