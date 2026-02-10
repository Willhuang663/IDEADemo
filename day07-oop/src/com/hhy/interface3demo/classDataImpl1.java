package com.hhy.interface3demo;

public class classDataImpl1 implements classData{
    private Student[] students;//记住送过来的学生对象信息

    public classDataImpl1(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentInfos() {
        System.out.println("全班学生信息如下:");
        for (Student student : students) {
            System.out.println(student.getName()+"==="+student.getSex()+"==="+student.getScore());
        }
    }

    @Override
    public void printAverageScore() {
        double sum=0;
        for (Student student : students) {
           sum+=student.getScore();
        }
        System.out.println(sum/students.length);
    }
}
