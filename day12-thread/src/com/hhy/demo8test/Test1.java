package com.hhy.demo8test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test1 {
    //完成多线程的案例
    static void main() {
        //1.100个员工实际就是100个线程，来竞争200个红包
        List<Integer> redPacket = getRedPacket();
        //3.定义线程类，创建100个线程，竞争同一个集合
        for(int i=1;i<=100;i++){
            new GetRedPacket(redPacket,"人"+i).start();
        }
    }
    //2.准备200个红包
    public  static List<Integer> getRedPacket(){
        Random random = new Random();
        List<Integer> redPacket=new ArrayList<>();
        for (int i = 1; i <=160; i++) {
            redPacket.add(random.nextInt(30)+1);//生成80%的0~30的金额
        }
        for (int i = 1; i <=40; i++) {
            redPacket.add(random.nextInt(70)+31);//生成20%的31-100的金额
        }
        return redPacket;

    }
}


