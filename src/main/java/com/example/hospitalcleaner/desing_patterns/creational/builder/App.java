package com.example.hospitalcleaner.desing_patterns.creational.builder;

public class App {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder(1,"deneme").withOptionalMozarella(true).withOptionalOlive(false).buildPizza();


    }
}