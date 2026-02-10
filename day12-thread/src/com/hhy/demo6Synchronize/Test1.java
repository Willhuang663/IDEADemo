package com.hhy.demo6Synchronize;

public class Test1 {
    static void main() {
        //线程安全 线程同步的方式三演示
        //1.设计一个账户类，用于创建两个人的共同账户对象，存入10万元
        Account acc=new Account(100);

        //2.设计线程类，创建小明和小红两个线程，模拟两人同时去同一个账户取钱
        Thread t2=new DrawThread("小红",acc);
        t2.start();
        Thread t1= new DrawThread("小明",acc);
        t1.start();



    }
}
