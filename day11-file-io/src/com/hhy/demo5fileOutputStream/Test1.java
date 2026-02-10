package com.hhy.demo5fileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test1 {
    static void main() throws IOException {
        //文件字节输出流
        //以内存为基准，把内存中的数据以字节的形式写到文件中出去
        //1.创建文件字节输出流与目标文件接通
        //覆盖管道
        //OutputStream outputStream=new FileOutputStream("D:\\Development\\work_space\\IDEADemo\\day11-file-io\\src\\a-out.txt");
        //追加数据,加入参数true
        OutputStream outputStream=new FileOutputStream("D:\\Development\\work_space\\IDEADemo\\day11-file-io\\src\\a-out.txt",true);


        //2.写入数据
        outputStream.write(97);//写入一个字节数据
        outputStream.write('a');//写入一个字符数据
        //outputStream.write('你');//写入一个字符数据---乱码
        //3.写一个字符数组
        byte[] bytes={97,98,99,100};
        outputStream.write(bytes);

        //4.写一个字节数组的一部分出去
        outputStream.write("\r\n".getBytes());
        outputStream.write(bytes,0,3);

        //关闭输出流
        outputStream.close();
    }
}
