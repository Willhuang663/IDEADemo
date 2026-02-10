package com.hhy.innerclass;

public class InnerClassDemo1 {
    //目标:成员内部类的语法格式
    //成员内部类创建对象的格式:
    //外部类名称.内部类名称 对象名 =new 外部类名称.new 内部类名称
    static void main() {
        Outer.Inner oi=new Outer().new Inner();
        //oi.show();
        //成员内部类访问访问外部类的特点
        //1.成员内部类中可以直接访问外部类的静态成员，也可以直接访问外部类的实例成员
        //2.成员内部类的实例方法中可以直接拿到当前寄生的外部类对象:外部类名.this
        Person.Test1 pt=new Person().new Test1();
        pt.Demo();
    }

}


class Person{
    private  int age=100;
    public class Test1{
        private int age=80;
        public void Demo(){
            int age=120;
          //120
            System.out.println(age);
            //80
            System.out.println(this.age);
            //100
            System.out.println(Person.this.age);
        }
    }
}