package com.hhy.demo7executorService;

//定义一个线程任务类实现Runnable接口
 public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {

            System.out.println(Thread.currentThread().getName()+"输出:"+i);
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}