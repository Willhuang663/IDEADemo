package com.hhy.demo6collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test2 {
    static void main() {
        //collection常用方法
        //List<String> collection=new ArrayList<>();
        Collection<String> collection=new ArrayList<>();
        //添加
        collection.add("111");
        collection.add("222");
        //获取集合元素的个数
        System.out.println(collection.size());
        //删除
        collection.remove("111");
        System.out.println(collection);
        //判断集合是否为空
        System.out.println(collection.isEmpty());

        //清空集合
        collection.clear();
        System.out.println(collection);
        collection.add("张三");
        //判断集合中是否存在某个数据
        collection.contains("张三");
        //把集合转化成数组(默认转化成object类型数组)
        Object[] array = collection.toArray();
        for (Object o:array){
            System.out.println(o);
        }
        System.out.println(Arrays.toString(array));
        //把集合转化成字符串数组
        String []arr2=collection.toArray(String[]::new);
    }
}
