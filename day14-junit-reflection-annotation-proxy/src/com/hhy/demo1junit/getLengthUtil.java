package com.hhy.demo1junit;

public class getLengthUtil {
    public static void demo1(String name){
        System.out.println("长度为:"+getLength(name));
    }
    public static  int getLength(String data){
        return data.length();
    }
}
