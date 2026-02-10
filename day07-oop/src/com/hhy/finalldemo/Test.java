package com.hhy.finalldemo;
// 测试类：体现 多态
public class Test {
    public static void main(String[] args) {
        // 多态写法：父类引用指向子类对象
        Animal cat=new Cat();
        Animal dog=new Dog();
        // 调用封装的set方法赋值，保证数据安全
        cat.setName("小花猫");
        cat.setAge(3);
        dog.setName("小黄狗");
        dog.setAge(-2); // 非法值被拦截

        // 多态核心：同一个方法，不同对象表现不同形态
        cat.behavior();
        dog.behavior();
    }
}