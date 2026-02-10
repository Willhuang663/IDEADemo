package com.hhy.demo3stream;

import java.util.*;
import java.util.stream.Stream;

public class Test2 {
    static void main() {
        //获取stream流
        //1.获取集合的stream流，直接调用集合提供的stream()方法
        Collection<String> collection=new ArrayList<>();
        collection.stream();
        Map<String,Integer> map=new HashMap<>();
        //map.stream()//报错
        //2.获取键流
        map.keySet().stream();
        //获取值流
        map.values().stream();
        //获取键值对流
        map.entrySet().stream();
        //3.获取数组的流
        String []names={"张三","李四","王五"};
        Arrays.stream(names);//
        Stream<String> stream = Stream.of(names);
        System.out.println(stream.count());
    }
}
