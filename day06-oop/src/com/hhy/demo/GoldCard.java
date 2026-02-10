package com.hhy.demo;

public class GoldCard extends Card{
    public GoldCard(String carId, String carName, String phone, double money) {
        super(carId, carName, phone, money);
    }

    public GoldCard() {
    }

    @Override
    public void useMoney(double money) {
        System.out.println("消费金额为:"+money);
        System.out.println("优惠后消费金额为:"+money*0.8);
        if(money*0.8>getMoney()){
            System.out.println("你当前所剩的余额为:"+getMoney()+"小于您的消费金额:"+money*0.8);
            return;
        }
        //更新金卡的账户金额
        setMoney(getMoney()-money*0.8);//继承自父亲的方法
        //判断消费大于200 调用独有的功能
        if (money*0.8>=200){
            printTicket();
        }else{
            System.out.println("消费了:"+money*0.8+"元,少于200，不能免费洗车");
        }


    }

    public void printTicket() {
        System.out.println("请打印洗车票");

    }
}
