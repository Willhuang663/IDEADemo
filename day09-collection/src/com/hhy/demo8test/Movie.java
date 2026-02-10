package com.hhy.demo8test;

public class Movie {
    private String name;
    private  String actor;
    private double price;
    private double score;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Movie() {
    }

    public Movie(String name, String actor, double price, double score) {
        this.name = name;
        this.actor = actor;
        this.price = price;
        this.score = score;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", actor='" + actor + '\'' +
                ", price=" + price +
                ", score=" + score +
                '}';
    }

}
