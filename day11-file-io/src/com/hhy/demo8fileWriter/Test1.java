package com.hhy.demo8fileWriter;

import java.io.*;

public class Test1 {
    static void main() {
        //把内存中的数据以字符的形式写出到文件中去
        //

        try(
                //1.创建一个字符输出流对象，指定写出的目的地
                Writer writer=new FileWriter("day11-file-io\\src\\demo7-out.txt");
                ){
            //2.写数据
            writer.write("a");
            writer.write(98);
            writer.write('黄');
            writer.write("\r\n");
            //写一个字符串
            writer.write("hello");
            writer.write("world");
            writer.write("你好世界");
            //写字符串的一部分出去
            writer.write("你好世界",1,2);
            //写一个字符数组
            writer.write("java".toCharArray());
            //写字符数组的一部分出去
            writer.write("java".toCharArray(),1,3);
            writer.flush();//刷新缓冲区，将缓冲区中的数据全部写出去
            //刷新后，流可以继续使用
            writer.close();//关闭包含了刷新
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
