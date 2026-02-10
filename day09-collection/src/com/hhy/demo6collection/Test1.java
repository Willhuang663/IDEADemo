package com.hhy.demo6collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {
    static void main() {
        //Collection集合的特点
        //1.list家族集合的特点：可重复、有序、有索引
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list.toString());
        System.out.println(list.get(0));
        //set家族集合：无序 不重复 没有索引
        Set<String> set=new HashSet<>();
        set.add("5");
        set.add("1");
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        System.out.println(set.toString());

    }
}
