package com.hhy.code;

import java.util.Arrays;
//代码块分为两种:静态代码块(属于类)和实例代码块(属于对象)
public class Test {
    public static  String name;
    //静态代码块，由static修饰，属于类，与类一起有限加载，自动执行一次
    //基本作用:可以完成对类的静态变量的初始化
    public  static String[] cards=new String[54];
    static {
        name="你好";
        System.out.println("=========静态代码块已经执行============");
        cards[0]="A";
        cards[1]="B";
        cards[2]="C";
    }
    static void main() {
        //使用代码块，搞清楚代码块的基本作用
        System.out.println("main方法执行了");
        System.out.println(name);
        System.out.println(Arrays.toString(cards));
    }
}
