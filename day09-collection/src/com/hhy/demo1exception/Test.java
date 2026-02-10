package com.hhy.demo1exception;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    static void main() {
        //异常的基本作用
        //Test1();
        try {
            //监视代码出现异常，会被catch拦截住
            Test2();
        } catch (Exception e) {
            e.printStackTrace();//打印异常信息
        }
    }
    //编译时异常
    //编译阶段报错，编译不通过
    public static void Test2() throws Exception {
        System.out.println("程序开始=====");
        String str="2025-07-09 11:12:13";
        //把字符串时间解析成日期对象

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(str);//编译时异常，提醒写作者这里的程序很容易出错，请注意;
        System.out.println(date);
        System.out.println("程序结束=====");
        InputStream is=new FileInputStream("D:/meinv.png");
    }
    //运行时的异常
    public static void Test1(){
        //运行时异常特点：编译阶段不报错，运行时报错 继承自RuntimeException
        int []arr={1,2,3};
       // System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
       // System.out.println(10/0);//ArithmeticException

        //空指针异常 NullPointerException 运行时异常
        String str=null;
        System.out.println(str);
        System.out.println(str.length());
        System.out.println();

    }
}
