package com.hhy.extends5override;

public class Test2 {
    //方法重写常见的应用场景,子类重写Object的toString方法，以便返回对象的内容
    static void main() {
       Student student=new Student("111",25);
        System.out.println(student);
        //1.直接输出对象，默认会调用Object.toString方法(可以输出不写)，返回对象的地址信息
        //2.输出对象的地址实际是没有意义的，开发中更希望输出对象时候看到对象的内容信息，所以子类需要重写tostring方法
        //以便以后输出对象时默认就近调用子类重写的toString方法返回对象的内容

    }
}
//默认继承Object
class  Student{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
