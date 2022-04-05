package com.example.hospitalcleaner.desing_patterns.creational.factory;

public class Mac implements Computer{


    @Override
    public void name() {
        System.out.println("MAC");
    }

    @Override
    public void since(int year) {
        System.out.println(year+" Yılında Alınmış");
    }
}
