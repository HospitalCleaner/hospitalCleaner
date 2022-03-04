package com.example.hospitalcleaner.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@MappedSuperclass
@Data
@NoArgsConstructor
public abstract class BaseEntity {

    @Column(name = "is_active")
    private int isActive = 1; //2 delete 1 active 0 passive

}
