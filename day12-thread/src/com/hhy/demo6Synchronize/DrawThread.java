package com.hhy.demo6Synchronize;

public class DrawThread extends Thread{
    private Account account;//记住线程要处理的账户对象

    public DrawThread(String name, Account acc) {
        super(name);
        this.account=acc;
    }
    @Override
    public void run() {
        //同时取钱
        account.draw(100);

    }
}
