package com.hhy.method1;

public class Student {
    private String name;
    private int age;
    private int height;
    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public Student(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

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
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public  static int CompareByAge(Student o1,Student o2){
        return o1.getAge()-o2.getAge();
    }

    public int CompareByHeight(Student o1,Student o2){
        return Integer.compare(o1.getHeight(),o2.getHeight());//封装好的方法
    }
}
