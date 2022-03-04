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
@PrimaryKeyJoinColumn(name = "boss_id")
@Table(name = "boss")
public class BossEntity extends UserEntity {

    //hastane ile one to one

    @OneToMany(mappedBy = "boss")
    private List<CleanerEntity> cleaners;


}
