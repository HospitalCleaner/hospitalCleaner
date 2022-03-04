package com.example.hospitalcleaner.business.requests;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoomEntityCRequest implements Serializable {
    private final String roomName;
    private final int cleanerId;
    private final int hospitalId;
}
