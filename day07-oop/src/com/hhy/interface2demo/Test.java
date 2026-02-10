package com.hhy.interface2demo;

public class Test {
    //使用接口的好处 弥补单继承的不足，一个类可以实现多个接口，使类功能更加强大
    static void main() {
        Person person=new Student();
        Driver driver=new Student();

        //接口实现面向接口编程，更利于解耦合
        Driver driver1=new Teacher();
    }
}
interface Driver{

}
interface BoyFriend{

}
class  Person{

}

class Student extends Person implements Driver,BoyFriend{

}

class  Teacher implements Driver,BoyFriend{

}