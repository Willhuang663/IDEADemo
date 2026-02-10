package com.hhy.finalldemo;

// 2. 继承：子类Cat继承父类Animal
public class Cat extends Animal {
    @Override
    public void behavior() {

        System.out.println(getName() + "（" + getAge() + "岁）：撒娇、抓老鼠");
    }
}
