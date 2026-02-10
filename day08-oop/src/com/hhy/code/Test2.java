package com.hhy.code;

public class Test2 {
    private  String name;
    private String []arr=new String[4];//实例变量
    //实例代码块(构造代码块) 无static修饰，属于对象，每次创建对象时，都会优先创建一次
    //基本作用:初始化对象的实例资源
    {
        System.out.println("实例代码块执行了");
        name="你好";
    }
    static void main() {
        //实例代码块
        System.out.println("main方法执行了");
        new Test2();//创建对象 调用实例代码块
        new Test2();
        new Test2();
    }
}
