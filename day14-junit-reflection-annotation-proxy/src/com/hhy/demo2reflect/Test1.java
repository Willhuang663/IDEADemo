package com.hhy.demo2reflect;

public class Test1 {
    static void main() throws ClassNotFoundException {
        //反射的第一步操作获取类的class对象(类的本身)
        //1.获取类本身：类.class
        Class c1= Studnet.class;
        System.out.println(c1);
        //2.获取类本身，class.forName(类的全面类名)
        Class c2 = Class.forName("com.hhy.demo2reflect.Studnet");
        System.out.println(c2);
        System.out.println(c1==c2);
        //3.获取类本身，对象.getClass()
        Studnet s=new Studnet();
        Class c3=s.getClass();
        System.out.println(c3);
    }
}
