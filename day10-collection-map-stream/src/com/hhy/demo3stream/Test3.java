package com.hhy.demo3stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Test3 {
    static void main() {
        //stream提供的常用的中间方法，对流上的数据进行中间处理(返回新流，支持链式编程)
        List<String> list=new ArrayList<>();
        list.add("张三");
        list.add("张三1");
        list.add("张三2");
        list.add("张三3");
        list.add("张三4");
        //1.过滤方法
        list.stream().filter(s -> s.startsWith("张三")&&s.length()==2).forEach(s -> System.out.println(s));
        //2.排序
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(2);
        list1.add(8);
        list1.stream().sorted().forEach(integer -> System.out.println(integer));//默认是升序
        System.out.println("降序排序");
//        list1.stream().sorted(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        }).forEach(integer -> System.out.println(integer));
        list1.stream().sorted((o1, o2) ->Integer.compare(o2,o1)).forEach(integer -> System.out.println(integer));
        System.out.println("限制前2个");
        list1.stream().sorted((o1, o2) ->Integer.compare(o2,o1)).limit(2).forEach(integer -> System.out.println(integer));
        System.out.println("跳过前2个");
        list1.stream().sorted((o1, o2) ->Integer.compare(o2,o1)).skip(2).forEach(integer -> System.out.println(integer));
        System.out.println("去重操作");
        list1.stream().sorted((o1, o2) ->Integer.compare(o2,o1)).distinct().forEach(integer -> System.out.println(integer));
        //映射/加工方法：把流上的数据拿出来变成新数据又放到流上去
        list1.stream().map(s->"加10分后:"+(s+10)).sorted().forEach(s -> System.out.println(s));
        //合并流
        Stream<String> stringStream = Stream.of("张三", "张三", "张三", "张三", "张三", "张三");
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Object> concat = Stream.concat(stringStream, integerStream);

        System.out.println(concat.count());


    }
}
