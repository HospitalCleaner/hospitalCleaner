package com.example.hospitalcleaner.desing_patterns.creational.singleton;

public class SingletonExample {
    //program çalıştıgında sadece 1 tane instance olmasını istiyoruz ve bunu static şekilde kendi classını çagıracak sekilde tanımlıyoruz
    private static SingletonExample instance;

    private SingletonExample() {
    }
    //eğer önceden instance atanmış ise tekrardan atama yapmaya gerek kalmadan intanse atanıyor yoksa da ilk instance atanmış oluyor
    private static SingletonExample getInstance(){

        if(instance==null){
            instance = new SingletonExample();
        }
        return instance;
    }

}
