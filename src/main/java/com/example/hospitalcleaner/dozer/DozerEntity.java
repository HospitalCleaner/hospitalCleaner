package com.example.hospitalcleaner.dozer;

public class DozerEntity {
    private String nom;
    private String surNom;
    private int age;


    public DozerEntity() {
    }

    public DozerEntity(String nom, String surNom, int age) {
        this.nom = nom;
        this.surNom = surNom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSurNom() {
        return surNom;
    }

    public void setSurNom(String surNom) {
        this.surNom = surNom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
