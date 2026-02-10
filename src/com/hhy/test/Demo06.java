package com.hhy.test;

public class Demo06 {
    //方法的重载
    //在同一个类中定义了多个同名的方法，这些方法具有相似的功能
    //每个方法具有不同的参数类型和参数个数，这些同名的方法就构成了重载的关系
    //会优先调用实参和形参一一对应的方法

 //Java 程序运行，是 JVM 按「加载类 → 找 main → 执行 main → 结束」的固定步骤来的；
 // 程序启动时，内存里只有类，没有对象，所以 main 必须加 static，才能被直接调用；
 // static 的作用：让内容属于类，会被类的全部对象共享 不用对象就能用；没有 static，必须 new 对象才能用
    //静态变量 又叫类变量
  static void main() {
        int a=10;
        int b=10;
        double c=10.0;
        double d=10.0;
        System.out.println(getSum(a,b));;
        System.out.println(getSum(c,d));
    }
    static int getSum(int a,int b){
        return a+b;
    }
    static  double getSum(double a,double b){
        return a+b;
    }

}
