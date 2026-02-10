package com.hhy.demo2threadapi;

public class Test1 {
    static void main() {
        Thread thread=new MyThread("线程1");
        //thread.setName("线程1");
        thread.start();

        //线程默认名：Thread-索引
        System.out.println(thread.getName());//Thread-0
        Thread thread2=new MyThread("线程2");
     //   thread2.setName("线程2");
        thread2.start();
        System.out.println(thread2.getName());
        //哪个线程调用这个代码，这个代码就是哪个线程
        Thread thread3=Thread.currentThread();//主线程
        thread3.setName("主线程");
        System.out.println(thread3.getName());

    }

}
class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(MyThread.currentThread().getName()+"输出:"+i);
        }
    }
}
