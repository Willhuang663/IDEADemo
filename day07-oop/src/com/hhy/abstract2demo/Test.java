package com.hhy.abstract2demo;

public class Test {
    static void main() {
        //使用抽象类的好处
        Animal cat=new Cat();//父类引用指向子类对象(多态 便于通用和解耦合)
        //Cat cat = new Cat() 为了「调用子类独有功能」，仅此一种场景需要用
        Animal dog=new Dog();
        cat.behavior();
        dog.behavior();
    }
}
