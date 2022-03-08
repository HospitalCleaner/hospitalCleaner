package com.example.hospitalcleaner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hospitals")
public class HospitalEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "hospital")
    private List<MaterialHospitalEntity> materialHospitals;

    @OneToMany(mappedBy = "hospital")
    private List<RoomEntity> roomEntities;

    public HospitalEntity(int id, String name, String address, List<MaterialHospitalEntity> materialHospitals) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.materialHospitals = materialHospitals;
    }

    public HospitalEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
