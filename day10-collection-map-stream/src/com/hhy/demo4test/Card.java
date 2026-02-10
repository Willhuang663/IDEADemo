package com.hhy.demo4test;

public class Card {
    private String size;
    private String color;
    //排序的时候用到num(仅针对斗地主游戏)
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Card(String size, String color, int num) {
        this.size = size;
        this.color = color;
        this.num = num;
    }

    @Override
    public String toString() {
        return   size +" "+ color;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Card() {
    }

}
