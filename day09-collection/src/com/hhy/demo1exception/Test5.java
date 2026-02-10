package com.hhy.demo1exception;

import java.util.Scanner;
//捕获异常对象，尝试修复
public class Test5 {
    static void main() {

        while (true) {
            try {
                System.out.println("程序开始");
                double price= show();
                System.out.println(price);
                break;
            } catch (Exception e) {
                System.out.println("输入的数据有误");
            }
        }
        System.out.println("程序结束");
    }
    public static double show(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入价格:");
        double price=scanner.nextDouble();
        return price;
    }

}
