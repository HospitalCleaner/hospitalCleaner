package com.example.hospitalcleaner.desing_patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Uye implements Cloneable{

    private List<String> uyeListesi;

    public Uye(){
        uyeListesi = new ArrayList<>();
    }

    public Uye(List<String> uyeListesi) {
        this.uyeListesi = uyeListesi;
    }

    public void uyeEkle() {

        uyeListesi.add("Burak");
        uyeListesi.add("Ahmet");
        uyeListesi.add("Mehmet");
    }

    public List<String> getUyeListesi() {
        return uyeListesi;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> uyeListesi = new ArrayList<>();
        for (String s :this.getUyeListesi()) {
            uyeListesi.add(s);
        }
        return new Uye(uyeListesi);
    }




    /*
    bu methot ile yazıldıgında yeni bir referans üretmiyor olan referansı veriyor ve burdan üretilen clone da herhangi bir
    değişiklik yapılması durumunda bütün clone larda bu değişiklikten etkileniyor eger böyle birşey istemiyorsak kendi kodlarımızı yazmamız gerekir
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/
}
