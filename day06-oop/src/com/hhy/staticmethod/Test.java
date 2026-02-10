package com.hhy.staticmethod;

public class Test {
    static void main() {
        //static修饰和不修饰方法
        //1.类名.静态方法(推荐)
        Student.print();

        //2.对象名.实例方法
        Student student=new Student();
        student.learn();
        //规范：如果这个方法只是为了做一个功能
        //且不需要直接访问对象的数据，这个方法直接定义成静态方法
        //如果这个方法是对象的行为，需要访问对象的数据，这个方法必须是实例方法
    }
}
