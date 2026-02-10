package com.hhy.abstract1demo;

public class AbstractDemo1 {
    static void main() {
        //认识抽象类和抽象方法
        //抽象类有得有失(得到了抽象方法的能力、但失去了创建对象的能力）
        //抽象类不能创建对象(重要)
        //抽象类的本质就是被子类继承
        B b=new B();
        b.test();
    }
}
