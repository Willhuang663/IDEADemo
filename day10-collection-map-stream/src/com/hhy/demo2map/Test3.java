package com.hhy.demo2map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test3 {
    static void main() {
        //map集合的遍历1.键找值
        Map<String,Integer> map=new HashMap<>();
        map.put("张三",25);
        map.put("李四",26);
        map.put("王五",27);
        map.put("张三",10);
        System.out.println(map);
        //1.可以先提取map集合的全部键到set集合中
        Set<String> keys=map.keySet();
        System.out.println(keys);
        //2.遍历set集合得到每一个键
        for(String key:keys){
            //根据键去找值
            Integer i = map.get(key);
            System.out.println(key+"======"+i);
        }

        //方式2 键值对方式遍历map集合
        //把map集合转化为Set集合，里面的元素都是键值对的类型（Map.entry<string ,Interger>）
        /*
         *map={李四=26, 张三=10, 王五=27}
         *map.entrySet
         *Set<Map.Entry<String, Integer>> entries =[(李四=26）, (张三=10), (王五=27)]
         */
        //遍历set集合得到每个键值对类型的元素
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> entry:entries){
           String key= entry.getKey();
           Integer value= entry.getValue();
            System.out.println(key+"="+value);
        }
        //方式三、Lambda表达式
        System.out.println("========================");
//        map.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.println(s+"==="+integer);
//            }
//        });
        //简写
//        map.forEach((String s, Integer integer)->{
//                System.out.println(s+"==="+integer);
//
//        });

        // 大括号中只有一盒语句，可以直接省略大括号再简写
        map.forEach(( s, integer)->System.out.println(s+"==="+integer));
    }
}
