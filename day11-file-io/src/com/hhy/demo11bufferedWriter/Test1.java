package com.hhy.demo11bufferedWriter;

import java.io.*;

public class Test1 {
    static void main() {
        //缓冲字符输出流的使用，提升了字符输出流的写数据性能，多了换行性能(特有的方法)
        //把内存中的数据以字符的形式写出到文件中去
        //
        try(
                //1.创建一个字符输出流对象，指定写出的目的地
                Writer writer1=new FileWriter("day11-file-io\\src\\demo11-out.txt",true);
                BufferedWriter writer=new BufferedWriter(writer1)//shift+f6 统一修改名称
        ){
            //2.写数据
            writer.write("a");
            writer.write(98);
            writer.write('黄');
            //writer.write("\r\n");
            writer.newLine();//换行，BufferedWriter特有的方法
            //写一个字符串
            writer.write("hello");
            writer.write("world");
            writer.write("你好世界");
            writer.newLine();
            //写字符串的一部分出去
            writer.write("你好世界",1,2);
            writer.newLine();
            //写一个字符数组
            writer.write("java".toCharArray());
            writer.newLine();
            //写字符数组的一部分出去
            writer.write("java".toCharArray(),1,3);
            writer.newLine();
            writer.flush();//刷新缓冲区，将缓冲区中的数据全部写出去
            //刷新后，流可以继续使用
            writer.close();//关闭包含了刷新
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
