package com.hhy.ooptest;

public class Test {
    static void main() {
        final int Number=100;

        System.out.println();
        Dog dog = new Dog();
//        dog.age=10;
//        dog.name="111";
//        dog.weight=12.0;
//        dog.color="黑色";
        dog.setName("小白");
        dog.setAge(2);
        System.out.println(dog.getAge());

        System.out.println(dog);
        dog.eat();
    }


}
