package com.hhy.poly2;

public class Test {
    static void main() {
        //多态
        //1.对象多态 行为多态
        Animal a1=new Cat(); //子类对象给到父类类型的变量
        a1.run();//方法：编译看左边，运行看右边 Animal中没有run方法会直接报错 运行的时候看右边子类


        System.out.println("====================");
        System.out.println(a1.name);//成员变量：编译看左边、运行看左边
        Animal a2=new Dog();
        a2.run();
        //强制类型转换
        //如果发现对象的真实类型与强转后的类型不同，就会报类型转换异常
        Dog dog1= (Dog) a2;
        dog1.cry();

        System.out.print(a2.name);


    }
}
