package com.example.hospitalcleaner.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Normalized;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class UserEntity extends BaseEntity{

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

        public UserEntity(int id, String name, String surName, String email, String password, String number) {
                this.id = id;
                this.name = name;
                this.surName = surName;
                this.email = email;
                this.password = password;
                this.number = number;
        }

        public UserEntity() {
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

        public String getSurName() {
                return surName;
        }

        public void setSurName(String surName) {
                this.surName = surName;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getNumber() {
                return number;
        }

        public void setNumber(String number) {
                this.number = number;
        }
}
