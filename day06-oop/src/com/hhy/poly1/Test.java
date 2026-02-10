package com.hhy.poly1;

public class Test {
    static void main() {
        //多态
        //1.对象多态 行为多态
        /*
        * 生活里的多态无处不在，和 Java 里的多态完全一样：
       同样是「叫」这个行为：小狗叫是「汪汪汪」，小猫叫是「喵喵喵」，公鸡叫是「喔喔喔」；
       同样是「跑」这个行为：豹子跑的飞快，乌龟跑的极慢，蜗牛跑的几乎不动；
       同样是「吃饭」这个行为：人用筷子吃饭，狗用嘴巴啃，鸟用嘴巴啄；
👉     核心共性：行为是同一个，执行的主体不同，结果就不同。
        * */
        Animal a1=new Cat(); //子类对象给到父类类型的变量
        a1.run();//方法：编译看左边，运行看右边 Animal中没有run方法会直接报错 运行的时候看右边子类
        System.out.println(a1.name);//成员变量：编译看左边、运行看左边
        Animal a2=new Dog();
        a2.run();
        System.out.print(a2.name);


    }
}
