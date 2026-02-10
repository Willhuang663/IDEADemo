package com.hhy.interface3demo;

public class classDataImpl2 implements classData{
    private Student[] students;//记住送过来的学生对象信息

    public classDataImpl2(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        int sum1=0;
        int sum2=0;
        System.out.println("全班的信息如下:");
        for(Student student:students){
            System.out.println(student.getName()+"==="+student.getSex()+"==="+student.getScore());
            if(student.getSex()=='男'){
                sum1++;
            }else{
                sum2++;
            }
        }
        System.out.println("男生有"+sum1+"人"+"女生有"+sum2);
    }

    @Override
    public void printAverageScore() {
        System.out.println("全班学生的平均分(去除最低分和最低分)为:");
        Student student=students[0];
        double sum=student.getScore();
        double max=student.getScore();
        double min=student.getScore();
        for(int i=1;i<students.length;i++){
            Student s=students[i];
            sum+=s.getScore();
            if(s.getScore()>max){
                max=s.getScore();
            }
            if (s.getScore()<min){
                min=s.getScore();
            }
            System.out.println("最高分为:"+max);
            System.out.println("最高底为:"+min);
            System.out.println("平均分为:"+(sum-max-min)/students.length);
        }

    }
}
