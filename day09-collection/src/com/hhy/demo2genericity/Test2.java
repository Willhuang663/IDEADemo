package com.hhy.demo2genericity;

public class Test2 {
    static void main() {
        //泛型类
        MyArrayList<String> list=new MyArrayList<>();//JDK之后后面的类型可以省略不写
        list.add("11");
        list.add("22");
        list.add("33");
        list.add("44");
        System.out.println(list);
        list.remove("44");
        System.out.println(list);
    }
}
