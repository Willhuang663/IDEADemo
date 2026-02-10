package com.hhy.demo3genericity;

public class StudentData implements Data<Student> {
    static void main() {
        //泛型接口的基本作用
        //对项目学生数据或者老师数据都要进行增删改查的操作
    }
    @Override
    public void add(Student student) {

    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student query(int id) {
        return null;
    }
}
