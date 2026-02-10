package com.hhy.abstract1demo;

public abstract class A {
    //抽象方法
    //用abstract修饰，没有方法体，只有方法声明
    //抽象类中不一定要有抽象方法 但由抽象方法必须要有抽象类
    //抽象类不能创建对象，仅作为特殊的父类让子类继承
    private String name;
    private int age;
    public abstract void test();
    public void test2(){
        System.out.println("普通方法");
    }

}
