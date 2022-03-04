package com.example.hospitalcleaner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rooms")
public class RoomEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Column(name="room_name")
    private String roomName;


    @ManyToOne
    @JoinColumn(name = "cleaner_id")
    private CleanerEntity cleaner;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private HospitalEntity hospital;


}
