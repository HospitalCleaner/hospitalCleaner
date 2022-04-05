package com.example.hospitalcleaner.desing_patterns.structural.bridge;

public class Pentagon extends Shape {
    public Pentagon(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.println("Pentagon filled with color");
        color.applyColor();
    }
}
