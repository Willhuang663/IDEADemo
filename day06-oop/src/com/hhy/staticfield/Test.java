package com.hhy.staticfield;

public class Test {
    static void main() {
        //静态变量：有static修饰，属于类，只加载一份，可以类和类的全部对象共享访问
        // static 的作用：让内容属于类，会被类的全部对象共享
        //认识 static修饰成员变量、特点和访问机制
        //1.访问静态变量(类变量)（类名.静态变量）推荐
        Student.name="张三";
        //2.对象名.静态变量(不推荐)
        Student student=new Student();
        student.name="张三1";
        System.out.println(student.name);
        System.out.println(Student.name);

        Student student2=new Student();
        //3.实例对象访问(对象变量) 对象名.实例变量
        //实例变量：没有static修饰、属于对象，每个对象都有一份
        student.age=20;
        student2.age=25;
        System.out.println(student.age);


    }
}
