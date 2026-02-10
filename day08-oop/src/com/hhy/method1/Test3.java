package com.hhy.method1;

import java.util.Arrays;
import java.util.Comparator;

public class Test3 {
    static void main() {
        //特定类型的方法引用
        //需求：字符串数组里面有一些人的名字，按照名字的首字母升序排序
        //String names[]=new String[5];
        String []names={"albea","Tom","Jerry","Mike","abondon","zhangxiao","王五"};
        //把数组进行排序
        //Arrays.sort(names);//默认就是按照首字母的升序排序
        //要求忽略首字母的大小进行升序排序（需要自己制定规则）
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //调用封装好的方法
//                return o1.compareToIgnoreCase(o2);
//            }
//        });
        //简化
        Arrays.sort(names,(o1,o2)->o1.compareToIgnoreCase(o2));
        //再简化 特定类型名称::方法名
        Arrays.sort(names,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));



    }

}
