package com.hhy.innerclass;
//外部类
public class Outer {
    public static String name="张三";
    public static void test(){
        System.out.println("=============");
    }
    private  int age;//实例成员
    //成员内部类：无static修饰，属于外部类的对象持有的
   public class Inner{
       public void show(){
           System.out.println("show");
           //可以直接访问外部类的静态变量
           System.out.println(name);
           System.out.println(Outer.name);
           test();
           //也可以直接访问外部类的实例成员
           System.out.println(age);
           System.out.println(this);//成员内部类自己的对象
           System.out.println(Outer.this);//寄生的外部类的对象
       }
    }
}

