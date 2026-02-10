package com.hhy.demo5Synchronize;
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

    //把访问共享资源的核心方法上锁，以此来保证线程的安全 synchronized
    public synchronized void draw(double money) {

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
