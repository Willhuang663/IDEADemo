package com.hhy.demo7executorService;

import java.util.concurrent.*;

public class Test2 {
    static void main() {
        //线程池的使用
        //1.使用线程池的实现类ThreadPoolExecuctor声明7个参数创建线程池对象
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3)
                , Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        //2.使用线程池处理Callable任务 复用线程
        Future<String> f1 = executor.submit(new MyCallable());
        Future<String> f2 = executor.submit(new MyCallable());
        Future<String> f3 = executor.submit(new MyCallable());
        Future<String> f4 = executor.submit(new MyCallable());
        try {
            System.out.println(f1.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(f2.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(f3.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(f4.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


    }
}
