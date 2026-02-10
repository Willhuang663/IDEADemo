package com.hhy.finaldemo;

public class finalDemo1 {
    //final修饰静态成员变量
    //final修饰静态变量 这个变量今后称为常量，可以记住一个固定的值，并且在程序中不能被修改了
    //常量的名称建议全部大写，多个单词用下划线连接
    public  static final  String SCHOOL_NAME="你好";
    //final修饰实例变量(一般没有意义)
    final private String name="猪八戒";
    static void main() {
        //3.final修饰变量(成员变量 局部变量) 只能被赋值一次
         final double rate=3.1415926;
        //rate=3.15;再次赋值会报错

    }
}
//1.final修饰类 不能被继承
//2.final修饰方法 方法不能被重写

class A{}

class B extends A{}
