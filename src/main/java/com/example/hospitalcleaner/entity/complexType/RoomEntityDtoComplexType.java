package com.example.hospitalcleaner.entity.complexType;

public class RoomEntityDtoComplexType {

    private  int id;
    private  String roomName;

    private int cleanerId;

    private int hospitalId;

    private double star;

    public RoomEntityDtoComplexType(int id, String roomName, int cleanerId, int hospitalId, double star) {
        this.id = id;
        this.roomName = roomName;
        this.cleanerId = cleanerId;
        this.hospitalId = hospitalId;
        this.star = star;
    }

    public RoomEntityDtoComplexType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getCleanerId() {
        return cleanerId;
    }

    public void setCleanerId(int cleanerId) {
        this.cleanerId = cleanerId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }
}
