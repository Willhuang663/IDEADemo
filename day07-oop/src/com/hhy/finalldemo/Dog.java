package com.hhy.finalldemo;

public class Dog extends Animal {
    @Override
    public void behavior() {
        System.out.println(getName() + "（" + getAge() + "岁）：看门、摇尾巴");
    }

    // 子类独有方法
    public void cry() {
        System.out.println(getName() + "：汪汪汪");
    }
}
