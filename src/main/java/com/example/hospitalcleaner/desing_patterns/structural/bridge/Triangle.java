package com.example.hospitalcleaner.desing_patterns.structural.bridge;

public class Triangle extends Shape{

    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.println("Triangle filled with color.");
        color.applyColor();
    }
}
