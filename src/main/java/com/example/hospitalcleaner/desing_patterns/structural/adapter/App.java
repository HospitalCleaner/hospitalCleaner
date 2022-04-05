package com.example.hospitalcleaner.desing_patterns.structural.adapter;

public class App {


    public static void main(String[] args) {
       Movable bugattiVeyron= new BugattiVeyron();
       MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        System.out.println(bugattiVeyronAdapter.getSpeed());

    }
}
