package com.hhy.finalldemo;

public  class Animal {
    // 1. 封装：父类Animal 完美封装
    // 属性私有化
    private String name;
    private int age;
    // 公共的get/set方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0 && age <= 20) {
            this.age = age;
        } else {
            System.out.println("年龄非法！");
            this.age = 0;
        }
    }

    // 封装的方法
    public void behavior() {
        System.out.println("动物的行为");
    }
}
