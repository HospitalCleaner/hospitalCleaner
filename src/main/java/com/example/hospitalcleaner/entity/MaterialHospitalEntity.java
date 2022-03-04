package com.example.hospitalcleaner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "materials_hospitals")
public class MaterialHospitalEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;



    @ManyToOne
    @JoinColumn(name = "material_id")
    private MaterialEntity material;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private HospitalEntity hospital;


    @Column(name = "quantity")
    private int quantity;


    @Column(name="expiry_date")
    private LocalDate expiryDate;
}
