package com.hhy.demo3stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test4 {
    static void main() {
        //掌握Stream流的收集操作(终结操作)
        List<Student> list=new ArrayList<>();
        list.add(new Student("张三",19,'男'));
        list.add(new Student("张三1",16,'男'));
        list.add(new Student("张三2",15,'男'));
        list.add(new Student("张三3",18,'男'));
        list.stream().filter(student -> student.getAge()>=18).forEach(student -> System.out.println(student));
        System.out.println("-------------------");
        long count = list.stream().filter(student -> student.getAge() >= 18).count();
        System.out.println(count);
        System.out.println("------------------------");
        //最大的对象
        Optional<Student> studentOptional = list.stream().max((s1, s2) -> Integer.compare(s1.getSex(), s2.getAge()));
        Student student = studentOptional.get();
        System.out.println(student);
        //收集到集合或者数组当中  流只能收集一次
        List<String> list1=new ArrayList<>();
        list1.add("张三");
        list1.add("李四");
        list1.add("张三1");
        list1.add("张三2");
        list1.add("张三3");
        Stream<String> stream = list1.stream().filter(s -> s.startsWith("张"));
        List<String> list2 = stream.collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(list2);
        //收集到数组
        Stream<String> stream2 = list1.stream().filter(s -> s.startsWith("张"));
        Object[] array = stream2.toArray();
        //打印数组内容
        System.out.println("数组:"+Arrays.toString(array));
        System.out.println("收集到map集合");
//        Map<Object, Object> map = list.stream().collect(Collectors.toMap(new Function<Student, Object>() {
//            @Override
//            public Object apply(Student student) {
//                return student.getName();
//            }
//        }, new Function<Student, Object>() {
//            @Override
//            public Object apply(Student student) {
//                return student.getAge();
//            }
//        }));
        Map<String, Integer> map = list.stream().collect(Collectors.toMap(s -> s.getName(), s -> s.getAge()));
        System.out.println(map);

    }
}
