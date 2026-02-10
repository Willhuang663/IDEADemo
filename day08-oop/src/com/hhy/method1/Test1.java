package com.hhy.method1;



import java.util.Arrays;

public class Test1 {
    static void main() {
        //静态方法引用
        test();

    }

    public  static void test(){
        Student students[]=new Student[3];
        students[0]=new Student("张三",24,180);
        students[1]=new Student("张三",26,180);
        students[2]=new Student("张三",25,180);
       // Arrays.sort(students,(o1,o2)->o1.getAge()-o2.getAge());
        //Arrays.sort(students,(o1,o2)->Student.CompareByAge(o1,o2));
        //如果某个Lambds表达式里只是调用一个静态方法，并且->前后参数的形式一致，就可以使用静态方法引用
        //格式:类型::静态方法
        Arrays.sort(students,Student::CompareByAge);//静态方法引用
        for (Student student:students){
            System.out.println(student);
        }
    }
}
