package com.hhy.demo1create;

public class Test1 {
    static void main() {
        //创建线程类的对象
        Thread myThread=new MyThread();
        //启动线程
        myThread.start();//启动线程，让线程启动run方法
        //注意:线程的启动必须调用start方法，不是调用run方法
        //直接调用run方法会当成普通的方法执行，此时还是相当于单线程执行
        //只有调用start方法才能启动一个新的线程执行
        //不能把主线程的任务放到启动子线程之前
        for (int i = 0; i < 6; i++) {
            System.out.println("主线程:"+i);
        }

    }}
    //定义一个子类继承Thread类，成为一个线程类
    class MyThread extends Thread{
    //2.重写继承自Thread的run方法

        @Override
        public void run() {
            //3.在run方法中编写线程需要做的任务
            for (int i = 0; i < 6; i++) {
                System.out.println("子线程:"+i);
            }
        }
    }
