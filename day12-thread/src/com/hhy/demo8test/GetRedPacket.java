package com.hhy.demo8test;

import java.util.List;

public class GetRedPacket extends Thread{
    private List<Integer> list;
    public GetRedPacket(List<Integer> redPacket, String name) {
        super(name);//super()表示调用父类Thread的构造方法。public Thread(String name)
        this.list=redPacket;//接收红包

    }

    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        while (true) {
            //100位人强集合中的金额
            synchronized (list){//list是所有线程共享的同一个对象
                //this 代表当前线程对象比如创建「人 1」线程时，this 就是「人 1」这个线程对象；「人 2」的 this 是「人 2」线程对象）；
                //100 个线程有 100 个不同的 this 对象 → 每个线程锁的是自己的对象，完全无法阻止其他线程操作 list → 同步失效！
                //对于实例方法用this作为锁对象
                //对于静态方法用类型.class作为锁对象
                if(list.size()==0){
                    break;
                }
                //随机产生一个索引
                int index = (int) (Math.random()*list.size());
                Integer money = list.remove(index);
                System.out.println(name+"抢到了"+money);
                if(list.size()==0){
                    System.out.println("活动结束");
                    break;
                }
            }
        }
    }
}
