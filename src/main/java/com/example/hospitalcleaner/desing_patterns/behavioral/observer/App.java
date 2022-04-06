package com.example.hospitalcleaner.desing_patterns.behavioral.observer;

public class App {
    public static void main(String[] args) {
        NewsAgency observable =new NewsAgency();
        NewsChannel observer=new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");
        System.out.println(observer.getNews());
        observable.setNews("current news!!");
        System.out.println(observer.getNews());
        NewsChannel observer2=new NewsChannel();
        observable.setNews("new 2");
        System.out.println(observer2.getNews());
        observable.addObserver(observer2);
        System.out.println(observer2.getNews());
        observable.setNews("News ...");
        System.out.println(observer2.getNews());
        System.out.println(observer.getNews());
    }
}
