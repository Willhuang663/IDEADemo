package com.hhy.demo2threadapi;

public class Test2 {
    static void main() {
        //Sleep方法 线程休眠
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                //让当前的执行线程进行休眠状态，直到时间到了，开始执行
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
