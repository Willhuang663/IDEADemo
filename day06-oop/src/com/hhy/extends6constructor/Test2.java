package com.hhy.extends6constructor;

public class Test2 {
    static void main() {
     Teacher teacher=new Teacher("张三",25,"教书");
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getSkill());
    }
}
