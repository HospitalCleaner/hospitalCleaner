package com.example.hospitalcleaner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

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

    @OneToMany(mappedBy = "room")
    private List<FeedbackEntity> feedbackEntities;

    public RoomEntity(int id, String roomName, CleanerEntity cleaner, HospitalEntity hospital, List<FeedbackEntity> feedbackEntities) {
        this.id = id;
        this.roomName = roomName;
        this.cleaner = cleaner;
        this.hospital = hospital;
        this.feedbackEntities = feedbackEntities;
    }

    public RoomEntity() {
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

    public CleanerEntity getCleaner() {
        return cleaner;
    }

    public void setCleaner(CleanerEntity cleaner) {
        this.cleaner = cleaner;
    }

    public HospitalEntity getHospital() {
        return hospital;
    }

    public void setHospital(HospitalEntity hospital) {
        this.hospital = hospital;
    }


}
