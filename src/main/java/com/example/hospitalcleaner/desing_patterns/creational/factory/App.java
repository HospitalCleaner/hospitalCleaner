package com.example.hospitalcleaner.desing_patterns.creational.factory;


import org.springframework.beans.factory.annotation.Autowired;

public class App {


    public static void main(String[] args) {
         Computer computer = new Asus();
           computer.name();
           computer.since(1982);
            computer= new Mac();
            computer.name();
            computer.since(2021);




    }
}
