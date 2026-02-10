package com.hhy.demo1hashset;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private char sex;

    //只要两个对象的内容一样，结果一定是true
    @Override
    public boolean equals(Object o) {
        //1.如果自己和自己比，直接返回true
        if(this==o)return  true;
        //2.如果o为空或者o不是Student类型直接fanhuifalse
        if (o == null || getClass() != o.getClass()) return false;
        //比较两个对象内容是否一样
        Student student = (Student) o;
        return age == student.age && sex == student.sex && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        //保证不同学生对象，如果内容一样则哈希值一定一样
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}'+"\n";
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Student() {
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
