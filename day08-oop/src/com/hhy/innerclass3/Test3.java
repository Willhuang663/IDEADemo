package com.hhy.innerclass3;

import java.util.Arrays;
import java.util.Comparator;

public class Test3 {
    static void main() {
        Student students[] =new Student[3];
        students[0]=new Student("张三",18,170);
        students[1]=new Student("李四",12,170);
        students[2]=new Student("王五",13,170);

        //按照年龄排序  参数二 给sort声明一个Comparator比较器对象(指定排序的规则)
        //sort方法内部会调用匿名内部类对象的Compare方法，对数组中的学生对象进行进行两两比较，从而实现排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //指定排序方法
                //如果左边对象大于右边对象就返回正整数
                //如果左边对象小于右边对象就返回负整数
                return o1.getAge()-o2.getAge();//按照年龄升序
            }
        });
        //Arrays.sort(students);
        for (Student student:students){
            System.out.println(student);
        }
    }
}
