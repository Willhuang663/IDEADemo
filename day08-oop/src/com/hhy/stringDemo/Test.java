package com.hhy.stringDemo;

public class Test {
    static void main() {
        /*
        * 只要是以"..."的方式写出的字符串对象，会存储到字符串常量池中且相同的字符串只存储一份
        * 通过new方式创建的字符串对象，每new一次都会产生一个新的对象放到堆内存中
        * */
        //字符串创造对象，封装要处理的字符串数据，调用String提供的方法处理字符串
        //1.推荐方式一，直接“‘创建字符串对象 然后封装数据
        String str="hello world";
        System.out.println(str);
        System.out.println(str.length());
        //2.方式二:通过构造器初始化对象
        String str2=new String("hello world");

        //3.方式三:
        char [] chars={'h','e','l','l','o'};
        String s = new String(chars);//把字符数组转化为字符串
        System.out.println(s);

        //方式4
        byte [] bytes={97,98,99,65,66,67};
        String s1 = new String(bytes);
        System.out.println(s1);
        String  t1="abc";
        String t2="abc";
        //只要是以"..."的方式写出的字符串对象，会存储到字符串常量池中且相同的字符串只存储一份
        System.out.println(t1==t2);
        System.out.println("======================");
        //通过new方式创建的字符串对象，每new一次都会产生一个新的对象放到堆内存中
        String str3=new String("hello world");
        String str4=new String("hello world");
        System.out.println(str3==str4);
        //字符串内容比较不能用==,==会默认比较地址，字符串对象的内容一样，地址不一定一样
        //判断字符串的内容，用equals方法，该方法只关心内容，不关心地址
        System.out.println(str3.equals(str4));
    }
}
