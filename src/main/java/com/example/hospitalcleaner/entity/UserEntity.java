package com.example.hospitalcleaner.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Normalized;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;

        @Column(name="name")
        private String name;

        @Column(name="surName")
        private String surName;

        @Column(name="email")
        private String email;

        @Column(name="password")
        private String password;

        @Column(name="number")
        private String number;


}
