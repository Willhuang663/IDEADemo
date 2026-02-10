package com.hhy.demo3threadSafe;
public class Account {
    private double Money;
    public Account() {
    }
    public double getMoney() {
        return Money;
    }

    public void setMoney(double money) {
        Money = money;
    }

    public Account(double money) {
        Money = money;
    }


    public void draw(double money) {
        //拿到取钱的对象
        String name=Thread.currentThread().getName();
        //判断余额是否充足
        if(this.Money>=money){
            System.out.println(name+"取钱"+money);
            this.Money-=money;
            System.out.println(name+"取钱成功，余额剩余:"+this.Money);
        }else{
            System.out.println(name+"余额不足");
        }
    }
}
