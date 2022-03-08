package com.example.hospitalcleaner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "cleaner_id")
@Table(name = "cleaners")
public class CleanerEntity extends UserEntity {

    @ManyToOne
    @JoinColumn(name = "boss_id")
    private BossEntity boss;

    @OneToMany(mappedBy = "cleaner")
    private List<RoomEntity> rooms;

    public BossEntity getBoss() {
        return boss;
    }

    public void setBoss(BossEntity boss) {
        this.boss = boss;
    }

    public CleanerEntity(int id, String name, String surName, String email, String password, String number, BossEntity boss) {
        super(id, name, surName, email, password, number);
        this.boss = boss;
    }

    public CleanerEntity() {

    }
}
