package com.hhy.demo2map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    static void main() {
        //map集合的特点
        //1.创建map集合
        //Map<String,Integer> map=new HashMap<>();//一行经典代码
        //HashMap 无序 不重复 没有索引 键值对都可以是null,值不做要求(可以重复)
        //LinkedHashMap 有序 不重复 、没有索引
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("张三",25);
        map.put("李四",26);
        map.put("王五",27);
        map.put("张三",10);
        System.out.println(map);
    }
}
