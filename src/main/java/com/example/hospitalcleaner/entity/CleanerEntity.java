package com.example.hospitalcleaner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "cleaner_id")
@Table(name = "cleaners")
public class CleanerEntity extends UserEntity {

    @ManyToOne
    @JoinColumn(name = "boss_id")
    private BossEntity boss;

    @OneToMany(mappedBy = "cleaner")
    private List<RoomEntity> rooms;

}
