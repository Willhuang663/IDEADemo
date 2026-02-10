package com.hhy.demo1create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test3 {
    static void main() {
        //第三种创建方式
        //前两种创建方式(类继承Thread和实现Runnable接口)存在的问题：
        //重写的run方法不能直接返回结果
        //3.创建一个Callable接口的实现类对象
        Callable<String> mc=new MyCallable();
        //4.把Callable类型的对象封装成FutureTask对象
        /***
         * 未来任务对象作用
         * 本质是一个Runnable对象，可以交给Thread线程对象处理
         * 获取线程执行完毕后的结果
         *
         * */
        FutureTask<String> futureTask = new FutureTask<>(mc);

        //5.把futureTask对象作为参数传递给Thread对象
        Thread thread = new Thread(futureTask);
        //6.开启线程
        thread.start();

        //7.获取线程的结果
        try {
            //主线程如果发现第一个线程没有执行完毕会让出cpu,等第一个线程执行完毕才会往下执行。
            System.out.println(futureTask.get());
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

}
//1.定义实现类实现Callable接口
class MyCallable implements Callable<String>{
    //2.重写call方法
    @Override
    public String call() throws Exception {
        int sum=0;
        for(int i=0;i<100;i++){
            sum+=i;
        }
        return "子线程计算的结果是:"+sum;
    }
}
