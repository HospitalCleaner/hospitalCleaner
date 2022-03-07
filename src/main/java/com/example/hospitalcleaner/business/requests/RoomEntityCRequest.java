package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class RoomEntityCRequest implements Serializable {
    private  String roomName;
    private  int cleanerId;
    private  int hospitalId;
}
