package com.hhy.demo;
public class Card {
    //lombok技术可以自动实现为类添加get、set、构造方法和toString
    private String carId;
    private String carName;
    private String phone;
    private double money;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Card() {
    }

    public Card(String carId, String carName, String phone, double money) {
        this.carId = carId;
        this.carName = carName;
        this.phone = phone;
        this.money = money;
    }
    //预存金额
    public void saveMoney(double money){
        this.money+=money;
    }
    //消费金额
    public void useMoney(double money){
        this.money-=money;
    }

}
