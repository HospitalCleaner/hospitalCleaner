package com.example.hospitalcleaner.desing_patterns.creational.factory;

public class Asus implements Computer{

    @Override
    public void name() {
        System.out.println("Asus");
    }

    @Override
    public void since(int year) {
        System.out.println(year+"senesinde alınmış");
    }
}
