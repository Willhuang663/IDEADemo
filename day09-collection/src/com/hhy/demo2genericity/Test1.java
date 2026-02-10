package com.hhy.demo2genericity;

import java.util.ArrayList;

public class Test1 {
    static void main() {
        //泛型  同一类型
        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("111");
        arrayList.add("2");
        arrayList.add("3");
        for (String str:arrayList){
            System.out.println(str);
        }
        //泛型的本质 把具体的数据类型作为参数传递给类型变量
    }
}
