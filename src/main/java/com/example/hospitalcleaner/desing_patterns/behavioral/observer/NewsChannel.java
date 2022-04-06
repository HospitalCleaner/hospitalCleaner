package com.example.hospitalcleaner.desing_patterns.behavioral.observer;

public class NewsChannel implements Channel{

    private String news;
    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }
    public NewsChannel() {
    }
    public NewsChannel(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

}
