package com.example.hospitalcleaner.desing_patterns.structural.bridge;

public class App {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColar());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColar());
        pent.applyColor();
    }
}
