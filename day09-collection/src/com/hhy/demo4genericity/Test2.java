package com.hhy.demo4genericity;

import java.util.ArrayList;

public class Test2 {
    static void main() {
        //目标:理解通配符和上下限
        ArrayList<XiaoMi> arrayList=new ArrayList<>();
        arrayList.add(new XiaoMi());
        arrayList.add(new XiaoMi());
        arrayList.add(new XiaoMi());
        go(arrayList);

        ArrayList<BMW> arrayList2=new ArrayList<>();
        arrayList2.add(new BMW());
        arrayList2.add(new BMW());
        arrayList2.add(new BMW());
        go(arrayList);


        ArrayList<Dog> arrayList3=new ArrayList<>();
        arrayList3.add(new Dog());
        arrayList3.add(new Dog());
        arrayList3.add(new Dog());
        //go(arrayList3);报错 因为dog并没有继承Car
    }
    //需求:开发一个人极品飞车游戏
    //虽然小米和宝马时car的子类 但是ArrayList<XiaoMi>和ArrayList<BMW> 都没有关系的
    //可以使用通配符 ，可以在使用泛型的时候代表一切类型，仅仅使用？可能导致其他类型的使用，dog、cat等明显错误的类型
    //这样的话，使用上下限来限制类型 上限： ？extends Car：？能接受的必须是car或者其子类
    //这样的话，使用上下限来限制类型 下限：？super Car：？能接受的必须是car或者其父类
    public static void go(ArrayList<? extends Car >cars){

    }

}
