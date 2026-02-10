package com.hhy.Lambda;

public class LambdaDemo1 {
    static void main() {
        //lambda的使用
        //Lambda只能简化函数式接口的匿名内部类！！！
        Swim swim=new Swim() {
            @Override
            public void Swimming() {
                System.out.println("游泳");
            }
        };
        swim.Swimming();
        Swim swim1=()->{
            System.out.println("Lambda");
        };
        swim1.Swimming();
    }
}
//函数式接口:只有一个抽象方法的接口
@FunctionalInterface//声明函数式接口的注解
interface   Swim{
    void Swimming();
}
