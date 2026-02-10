package com.hhy.demo7executorService;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test1 {
    static void main() {
        //线程池的使用
        //1.使用线程池的实现类ThreadPoolExecuctor声明7个参数创建线程池对象
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3)
                , Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        //maximumPoolSize 必须大于等于 corePoolSize
        /*
        * corePoolSize 是「保底的常驻线程数」（20），意味着线程池想维持 20 个核心线程；
          maximumPoolSize 是「线程总数上限」（5），意味着线程池最多只能有 5 个线程；
          这就像「要求你至少留20个人在岗，但又规定现场最多只能有 5 个人」，完全自相矛盾，线程池无法执行这个逻辑。
        * */
        //2.使用线程池处理任务 复用线程
        MyRunnable runnable = new MyRunnable();
        executor.execute(runnable);//提交第一个任务 创建线程 自动启动线程处理任务
        executor.execute(runnable);//提交第二个任务
        executor.execute(runnable);//提交第三个任务
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        //到了创建临时线程的时机(任务队列的容量为3)
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);//此刻到了任务拒绝(线程创建的最大数量为5，此时都已经忙碌起来)的策略了，忙不过来，报错


    }
}
