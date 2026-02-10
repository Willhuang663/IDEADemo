package com.hhy.interface3demo;

public class Test {
    static void main() {
        //完成接口的小案例
        //1.定义学生类，封装学生数据
        Student [] allStudents=new Student[3];
        allStudents[0]=new Student("张三",'男',100);
        allStudents[1]=new Student("李四",'女',85);
        allStudents[2]=new Student("王五",'男',60);
        //提供两套业务实现方案，支持灵活切换(解耦合)
        classData classData1=new classDataImpl2(allStudents);
        classData1.printAllStudentInfos();
        classData1.printAverageScore();


    }
}

