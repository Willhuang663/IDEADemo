package com.hhy.demo7fileReader;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Test1 {
    static void main() throws Exception {
        //文件字符输入流读取字符到程序中
        //1.创建文件字符流与源文件接通
        Reader fileReader=new FileReader("day11-file-io\\src\\demo7.txt");
        //2.定义字符数组，每次读入多个字符
        char[] chars=new char[3];
        int len;//用于记录每次读取多少字符
        while((len=fileReader.read(chars))!=-1){
            //每次读入多少字符，就写出多少的字符
            String string = new String(chars, 0, len);
            //文本内容自带换行
            //文件字符输入流每次读取多个字符，性能较好，而且读取中文是按照字符读取，不会出现乱码，这是一种读取中文很好的方案
            System.out.println(string);
        }

    }
}
