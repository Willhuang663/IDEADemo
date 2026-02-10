package com.hhy.abstract1demo;

public class B extends A{
    //一个类继承抽象类必须重写完父类的全部抽象方法，否则这个类也必须设计成抽象类
    @Override
    public void test() {
        System.out.println("B类重写的抽象方法");
    }
}
