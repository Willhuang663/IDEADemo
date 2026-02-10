package com.hhy.demo1hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    static void main() {
        //set集合家族的特点
        // set集合 无序 添加元素和获取到的数据顺序不一致，不重复、没有索引
        //Set<String> set=new HashSet<>();//HashSet 无序 添加元素和获取到的数据顺序不一致，不重复、没有索引
        Set<String> set=new LinkedHashSet<>();//LinkedHashSet 有序 、不重复、没有索引
        set.add("张三");
        set.add("张三");
        set.add("李四");
        set.add("王五");
        System.out.println(set);

        Set<Integer> set1=new TreeSet<>();//TreeSet 排序(默认一定要大小升序排序) 、不重复、没有索引
        set1.add(6);
        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(5);
        System.out.println(set1);
    }
}
