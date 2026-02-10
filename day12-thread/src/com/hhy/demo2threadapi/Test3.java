package com.hhy.demo2threadapi;

public class Test3 {
    static void main() throws InterruptedException {
        //线程的join方法:线程插队，让调用这个方法的线程先执行完毕
        Thread thread=new MyThread1();
        thread.start();
            for (int i=0;i<10;i++){
                System.out.println(MyThread.currentThread().getName()+"输出:"+i);
                if(i==1){//如果主线程输出到1,让子线程插队
                    thread.join();//插队，让t1线程先执行完毕，然后再执行主线程
                }
        }
    }
}
class MyThread1 extends Thread{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(MyThread.currentThread().getName()+"输出:"+i);
        }
    }
}
