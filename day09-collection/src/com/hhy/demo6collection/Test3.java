package com.hhy.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Test3 {
    //集合的遍历
    static void main() {
        //1.迭代式遍历
        Collection<String> collection=new ArrayList<>();
        collection.add("张三");
        collection.add("张三1");
        collection.add("张三2");
        collection.add("张三3");
        System.out.println(collection);
        //1.得到这个集合的迭代器对象
        Iterator<String> it=collection.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        System.out.println("======================");
        //使用while循环遍历
        while(it.hasNext()){
            //判断当前有没有数据
            String string = it.next();
            System.out.println(string);
        }
        System.out.println("======================");

        //2.增强for循环
        for(String str:collection){
            System.out.println(str);
        }
        int []arr={1,2,3,4,5};
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println("===============");
        //3.Lambda表达式
//        collection.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        /*
         *(被重写方法的形参列表)->{
         *      被重写的方法体代码
         * }
         */
        //collection.forEach(s->System.out.println(s));
        collection.forEach(System.out::println);
    }
}
