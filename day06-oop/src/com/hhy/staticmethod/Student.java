package com.hhy.staticmethod;

public class Student {
    //静态方法：有static修饰，属于类持有
    public static  void print(){
        System.out.println("我是学生");
    }

    //实例方法：没有static修饰，属于对象持有
    public  void learn(){
        System.out.println("学生在学习");
    }
}
