package com.hhy.innerclass2;

public class InnerClassDemo {
    static void main() {
        //静态内部类的语法
        //创建对象 外部类名.内部类名 对象名= new 外部类.内部类
        Outer.Inner in=new Outer.Inner();
        in.show();
        //1.静态内部类中
    }
}
