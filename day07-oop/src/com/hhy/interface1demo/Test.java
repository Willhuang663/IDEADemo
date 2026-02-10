package com.hhy.interface1demo;

public class Test  implements A,B {
    static void main() {
        //接口的特点和基本使用
        System.out.println(A.NAME);
        //接口不能创建对象，用来被类实现，一个类可以实现多个接口

    }

    @Override
    public void test() {
        System.out.println("实现接口的方法");
    }
}
