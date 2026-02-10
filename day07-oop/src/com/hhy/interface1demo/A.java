package com.hhy.interface1demo;

public interface A {
    //接口A 使用interface关键字定义
    //在jdk8之前，接口中只能定义常量和抽象方法
    //接口中定义常量可以省略public static final
    String NAME="张三";
    //接口中定义抽象方法可以省略public abstract 默认会加上去
    void test();



}
