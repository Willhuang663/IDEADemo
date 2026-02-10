package com.hhy.demo7executorService;

import java.util.concurrent.Callable;

//1.定义实现类实现Callable接口
 public class MyCallable implements Callable<String>{
    //2.重写call方法
    @Override
    public String call() throws Exception {
        int sum=0;
        for(int i=0;i<100;i++){
            sum+=i;
        }
        return Thread.currentThread().getName()+"结果为:"+sum;
    }
}
