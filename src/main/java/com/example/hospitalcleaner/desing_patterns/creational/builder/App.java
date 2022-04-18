package com.example.hospitalcleaner.desing_patterns.creational.builder;

import com.example.hospitalcleaner.dozer.DozerApp;

public class App {


    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder(1,"deneme").withOptionalMozarella(true).withOptionalOlive(false).buildPizza();


    }
}