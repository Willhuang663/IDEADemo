package com.hhy.demo;

public class SilverCard extends Card{
    public SilverCard() {
    }

    public SilverCard(String carId, String carName, String phone, double money) {
        super(carId, carName, phone, money);
    }

    @Override
    public void useMoney(double money) {
        System.out.println("消费金额为:"+money);
        System.out.println("优惠后消费金额为:"+money*0.9);
        if(money*0.9>getMoney()){
            System.out.println("你当前所剩的余额为:"+getMoney()+"小于您的消费金额:"+money*0.9);
            return;
        }
        //更新金卡的账户金额
        setMoney(getMoney()-money*0.9);//继承自父亲的方法
    }
}
