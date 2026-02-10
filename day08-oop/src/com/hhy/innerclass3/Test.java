package com.hhy.innerclass3;

public class Test {
    static void main() {
        //匿名内部类的基本作用
        //匿名内部类实际上是有名字的:外部类名称$编号.class

        Animal animal= new Animal() {
            @Override
            public void cry() {
                System.out.println("小猫喵喵叫");
            }
        };//匿名内部类本质是一个子类，并且会立即创建出一个子类对象
        animal.cry();
    }
}

//class  Cat extends Animal {
//
//    @Override
//    public void cry() {
//        System.out.println("小猫喵喵叫");
//    }
//}
