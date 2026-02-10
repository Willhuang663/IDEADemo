package com.hhy.demo3stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    static void main() {
        //stream流的的使用 简化集合数组操作的步骤 结合了lambda表达式 数据源可以是集合或者数组
        //1.获取stream流  2.调用流水线上的各种方法  3.获取处理的结果(可以返回到一个新的集合中)
        List<String> list=new ArrayList<>();
        list.add("张三");
        list.add("张三");
        list.add("李四");
        list.add("张三丰");
        list.add("王五");

        System.out.println(list);
        //需求1:找出姓张的，名字是个字的存入新集合中（传统做法）
        List<String> list1=new ArrayList<>();
        for (String str:list){
            if(str.startsWith("张")&&str.length()==2){
                list1.add(str);
            }
        }
        System.out.println(list1);
        System.out.println("=============================");
        //Stream流的做法  流可以看成传送带 然后进行条件过滤
        List<String> list2 = list.stream().filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 2)
                .collect(Collectors.toList());
        System.out.println(list2);
//                .forEach(name-> System.out.println(name));

    }
}
