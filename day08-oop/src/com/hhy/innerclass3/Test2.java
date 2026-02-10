package com.hhy.innerclass3;

public class Test2 {
    static void main() {
        //匿名内部类的使用形式:通常可以作为一个对象参数传递给方法使用
        //需求：学生、教师都需要参加游泳比赛
        Swim swim=new Swim() {
            @Override
            public void Swimming() {
                System.out.println("学生参加游泳");
            }
        };
        start(swim);
        System.out.println("================");
        Swim swim1=new Swim() {
            @Override
            public void Swimming() {
                System.out.println("老师参加");
            }
        };
        start(swim1);
    }
    //设计一个方法可以接受老师和学生参加游泳比赛
    public static void start(Swim swim){
        System.out.println("开始");
        swim.Swimming();
        System.out.println("结束");
    }
}
//class Student implements Swim{
//    @Override
//    public void Swimming() {
//        System.out.println("学生参加");
//    }
//}
//class Teacher implements Swim{
//    @Override
//    public void Swimming() {
//        System.out.println("老师参加");
//    }
//}
interface Swim{
    void Swimming();//游泳方法
}
