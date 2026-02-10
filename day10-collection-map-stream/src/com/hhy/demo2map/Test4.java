package com.hhy.demo2map;

import java.util.*;

public class Test4 {
    static void main() {
       calc();
    }

    private static void calc() {
        //目的地
        String []locations={"A","B","C","D"};
        //list集合 可重复 有序 有索引 用于存储投票的地点
        List<String> list=new ArrayList<>();
        //Random类是Java专门用于生成随机数的工具，nextInt(n) 直接返回0 ≤ x < n 的随机整数，不用手动处理优先级
        Random random = new Random();
        for(int i=1;i<=80;i++){
            //生成随机选择的地点
           //需要注意优先级
           // int id=(int) Math.random()*locations.length;//错误，结果会都是0 返回 0.5、0.8、0.999，强转 int 后都是 0，需要在Math外面在（）
            //int id=(int) (Math.random()*locations.length);
            int index = random.nextInt(locations.length);
            list.add(locations[index]);
        }
        System.out.println(list.size());
        Map<String,Integer> map=new HashMap<>();
        for(String location:list){
//            if(map.containsKey(location)){
//                map.put(location,map.get(location)+1);
//            }else{
//                map.put(location, 1);
//            }
            //三目运算符
            map.put(location,map.containsKey(location)?map.get(location)+1:1);
        }
        map.forEach((k,v)->System.out.println(k+"="+v));
    }
}
