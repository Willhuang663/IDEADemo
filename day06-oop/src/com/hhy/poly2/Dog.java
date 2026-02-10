package com.hhy.poly2;

public class Dog extends Animal {
    String name="狗";
    @Override
    public void run() {
        System.out.println("小狗跑得快");
    }
    public void cry(){
        System.out.println("小狗汪汪叫");
    }
}
