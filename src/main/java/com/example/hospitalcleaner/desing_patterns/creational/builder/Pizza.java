package com.example.hospitalcleaner.desing_patterns.creational.builder;


public class Pizza {
    private final int size;
    private final String name;
    private boolean cheese;
    private boolean olive;
    private boolean pepperoni;
    private boolean bacon;
    private boolean mushroom;
    private boolean mozarella;

    private Pizza(PizzaBuilder pizzaBuilder) {
        this.size = pizzaBuilder.size;
        this.name = pizzaBuilder.name;
        this.cheese = pizzaBuilder.cheese;
        this.olive = pizzaBuilder.olive;
        this.pepperoni = pizzaBuilder.pepperoni;
        this.bacon = pizzaBuilder.bacon;
        this.mushroom = pizzaBuilder.mushroom;
        this.mozarella = pizzaBuilder.mozarella;
    }

    public static class PizzaBuilder {

        private final int size;
        private final String name;
        private boolean cheese;
        private boolean olive;
        private boolean pepperoni;
        private boolean bacon;
        private boolean mushroom;
        private boolean mozarella;

        public PizzaBuilder(int size, String name) {
            this.size = size;
            this.name = name;
        }

        public PizzaBuilder withOptionalCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder withOptionalOlive(boolean olive) {
            this.olive = olive;
            return this;
        }

        public PizzaBuilder withOptionalPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder withOptionalMushroom(boolean mushroom) {
            this.mushroom = mushroom;
            return this;
        }

        public PizzaBuilder withOptionalBacon(boolean bacon) {
            this.bacon = bacon;
            return this;
        }

        public PizzaBuilder withOptionalMozarella(boolean mozarella) {
            this.mozarella = mozarella;
            return this;
        }

        public Pizza buildPizza() {
            return new Pizza(this);
        }
    }
}

