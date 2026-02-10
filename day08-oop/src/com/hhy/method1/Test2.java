package com.hhy.method1;

import java.util.Arrays;

public class Test2 {
    static void main() {
        //实例方法的引用
        //对象名::实例方法名称
        test();
    }
    public static void test(){
        Student students[]=new Student[3];
        students[0]=new Student("张三",25,170);
        students[1]=new Student("张三",22,169);
        students[2]=new Student("张三",26,185);
        Student student=new Student();
        //Arrays.sort(students,(o1,o2)->student.CompareByHeight(o1,o2));
        //简化之后的实例方法引用 对象名::实例方法名称
        //前提:->前后的参数类型一致
        Arrays.sort(students,student::CompareByHeight);
        for(Student student1:students){
            System.out.println(student1);
        }
    }
}
