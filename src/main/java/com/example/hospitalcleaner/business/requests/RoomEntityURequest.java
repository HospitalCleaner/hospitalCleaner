package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class RoomEntityURequest implements Serializable {
    private  int isActive;
    private  int id;
    private  String roomName;
    private  int cleanerId;
    private  int hospitalId;
}
