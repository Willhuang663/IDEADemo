package com.hhy.demo10bufferedReader;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Test1 {
    //缓冲字符输入流读取文本内容，性能提升，多了按照行读取文本的能力(BufferedReader 提供的独有功能)
    static void main() throws Exception {
        //文件字符输入流读取字符到程序中
        //1.创建文件字符流与源文件接通
        Reader fileReader1=new FileReader("day11-file-io\\src\\demo7.txt");
        //创建缓冲字符输入流包装低级的字符输入流
        BufferedReader fileReader=new BufferedReader(fileReader1);
        //2.定义字符数组，每次读入多个字符
//        char[] chars=new char[3];
//        int len;//用于记录每次读取多少字符
//        while((len=fileReader.read(chars))!=-1){
//            //每次读入多少字符，就写出多少的字符
//            String string = new String(chars, 0, len);
//            //文本内容自带换行
//            //文件字符输入流每次读取多个字符，性能较好，而且读取中文是按照字符读取，不会出现乱码，这是一种读取中文很好的方案
//            System.out.print(string);
        //每次读一行数据返回 ，没有则返回null
//        System.out.println(fileReader.readLine());
//        System.out.println(fileReader.readLine());
//        System.out.println(fileReader.readLine());
//        System.out.println(fileReader.readLine());
        //使用循环改进，来按照行读取数据
        //定义字符串变量，用于记住每次读取的字符串数据
        String line;
        while((line=fileReader.readLine())!=null){
            System.out.println(line);
        }//目前读取文本最优雅的方案，不乱码、可以按照行读取。

    }

    }