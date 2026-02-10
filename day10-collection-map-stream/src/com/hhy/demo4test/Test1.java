package com.hhy.demo4test;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    static void main() {
        //可变参数 灵活接收数据
        sum();//不传参数
        sum(1);
        sum(1,2,3);
        sum(new int[]{1,2,3});
    }
    int arr[]=new int[10];
    int []arr2={1,2,3};
    //可变参数在形参列表中只能有一个
    //可变参数必须放在形参列表的最后面
    private static void sum(int... nums) {
        //内部拿数据
        //可变参数对内实际上就是一个数组，nums就是一个数组
        System.out.println("==============");
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("==============");

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(43);
        list.add(6);
        list.add(8);
        System.out.println(list);
        //随机打乱list集合中的数据
        Collections.shuffle(list);
        System.out.println(list);
        //对list集合进行升序排序
        Collections.sort(list);
        System.out.println(list);
        //对list集合进行批量的添加
        Collections.addAll(list,200,300,400,500,600);
        System.out.println(list);
        //对list集合进行自定义规则排序
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
        Collections.sort(list,((o1, o2) -> o2-o1));
        System.out.println(list);
        }
}
