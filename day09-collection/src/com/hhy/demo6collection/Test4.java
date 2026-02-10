package com.hhy.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test4 {
    static void main() {
        //认识并发修改问题和每种遍历的区别
        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("枸杞");
        list.add("枸杞1");
        list.add("枸杞2");
        list.add("枸杞3");
        list.add("c++");
        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            String name=list.get(i);
//            if(name.contains("枸杞")){
//                list.remove(name);
//            }
//        }//出现并发修改的异常
        //本质原因是每次删除数据后，后面的数据补上去存在跨位的情况，导致漏删。
        System.out.println(list);//[java, 枸杞1, 枸杞3, c++]
        System.out.println("========================");
        List<String> list2=new ArrayList<>();
        list2.add("java");
        list2.add("枸杞");
        list2.add("枸杞1");
        list2.add("枸杞2");
        list2.add("枸杞3");
        list2.add("c++");
        System.out.println(list2);
        for (int i = 0; i < list2.size(); i++) {
            String name=list2.get(i);
            if(name.contains("枸杞")){
                list2.remove(name);
                i--;//解决方案1：删除数据后做i--的操作
            }
        }
        System.out.println(list2);
        System.out.println("==========================");
        //解决方案2：倒着遍历并删除(前提是支持索引)
        List<String> list3=new ArrayList<>();
        list3.add("java");
        list3.add("枸杞");
        list3.add("枸杞1");
        list3.add("枸杞2");
        list3.add("枸杞3");
        list3.add("c++");
        System.out.println(list3);
        for (int i = list3.size()-1; i>=0; i--) {
            String name=list3.get(i);
            if(name.contains("枸杞")){
                list3.remove(name);
            }
        }
        System.out.println(list3);
        System.out.println("======================");
        //迭代器遍历并删除也存在并发修改的异常问题，解决方案：使用迭代器自己的方法删除
        Collection<String> list4=new ArrayList<>();
        list4.add("java");
        list4.add("枸杞");
        list4.add("枸杞1");
        list4.add("枸杞2");
        list4.add("枸杞3");
        list4.add("c++");
        Iterator<String> it=list4.iterator();
        while(it.hasNext()){
            String name=it.next();
            if(name.contains("枸杞")){
                //list4.remove(name);
                it.remove();
            }
        }
        System.out.println(list4);
        System.out.println("=========================");
        //用增强for循环和Lambda都没有办法解决并发修改问题
        //增强for循环和Lambda只适合做删除，并不适合做遍历过程中并修改

    }
}
