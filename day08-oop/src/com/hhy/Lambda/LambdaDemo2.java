package com.hhy.Lambda;

import com.hhy.innerclass3.Student;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    static void main() {
        //用lambda表达式简化实际的示例
        Student students[]=new Student[3];
        students[0]=new Student("张三",15,170);
        students[1]=new Student("张三",13,180);
        students[2]=new Student("张三",22,185);

//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        //简化之后
//        Arrays.sort(students,(Student o1,Student o2)->{
//            return o1.getAge()-o2.getAge();
//        });//如果lambda的表达式中只有一行代码，大括号可以不写，同时还要省略分号；如果这行代码是return 语句也必须去掉return
        Arrays.sort(students,( o1, o2)-> o1.getAge()-o2.getAge());
        for (Student student:students){
            System.out.println(student);
        }
    }
}
