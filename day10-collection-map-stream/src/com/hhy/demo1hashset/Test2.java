package com.hhy.demo1hashset;

import java.util.HashSet;
import java.util.Set;

public class Test2 {
    static void main() {
        //掌握hashset集合的去重操作
        Student student1=new Student("张三",15,'男');
        Student student2=new Student("李四",16,'男');
        Student student3=new Student("张三",15,'男');
        Student student4=new Student("王五",18,'女');
        Set<Student> set=new HashSet<>();
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        System.out.println(set);
    }
}
