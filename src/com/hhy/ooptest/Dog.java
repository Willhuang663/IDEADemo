package com.hhy.ooptest;

public class Dog {
    private String name;
    private int age;


    void eat(){
        System.out.println("吃骨头");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        //this的本质是所在方法调用者的内存地址
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0&&age<=15){
            this.age=age;
        }
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
