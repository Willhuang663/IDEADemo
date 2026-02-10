package com.hhy.innerclass2;
//外部类
public class Outer {
    public static String name="张三";

    private int age;
    //静态内部类:属于外部类本身持有
    public static  class Inner{
        public void show(){
            System.out.println("===========");
            //静态内部类可以直接访问外部类的静态成员
            System.out.println(name);
            //静态内部类不可以直接访问外部类的实例成员
            //外部类的实例成员属于外部类的对象
            //System.out.println(age);
        }
    }
}
