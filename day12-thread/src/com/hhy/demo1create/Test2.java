package com.hhy.demo1create;

public class Test2 {
    //创建线程的第二种方式
    static void main() {
       //创建线程任务类对象代表一个线程
        Runnable r=new MyRunnable();
        //把线程任务类对象交给一个线程对象
        Thread thread=new Thread(r);
        //启动线程
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程:"+i);
        }
    }

}

//定义一个线程任务类实现Runnable接口
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("子线程:"+i);
        }

    }
}