package com.hhy.demo7list;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    static void main() {
        //list系列集合独有的功能
        List<String> list=new ArrayList<>();
        list.add("张三");
        list.add("张三1");
        list.add("张三2");
        //在第3个位置插入一个数据
        list.add(2,"张三3");
        System.out.println(list);
        //根据索引删除张三2，可以返回对应的数据
        System.out.println(list.remove(3));
        System.out.println(list);
        //把张三修改成李四
        list.set(0,"李四");
        System.out.println(list);
        //根据索引获取李四
        System.out.println(list.get(0));
    }
}
