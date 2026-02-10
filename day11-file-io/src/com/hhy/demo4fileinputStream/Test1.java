package com.hhy.demo4fileinputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test1 {
    static void main() throws Exception {
        //io流作用读写数据
        //读取字节数据
        //1.创建文件字节输入流管道与源文件接通(与磁盘中的文件建立连接)
        //FileInputStream fileInputStream=new FileInputStream(new File("D:\\Development\\work_space\\IDEADemo\\day11-file-io\\src\\a.txt"));
        //简化写法
        InputStream fileInputStream=new FileInputStream( "D:\\Development\\work_space\\IDEADemo\\day11-file-io\\src\\a.txt");
        //2.读取文件中的字节
        //定义变量记住每次读取的字节
        int b;
//        while((b=fileInputStream.read())!=-1){
//            System.out.print((char) b);
//        }
        //每次读取一个字节性能较差，读取汉字输出一定会乱码

        //每次读取多个字节
        //定义一个字节数组用于每次读取字节
        byte[] buffer=new byte[3];
        //定义变量记住每次读取了多少个字节
        int len;
//        while((len=fileInputStream.read(buffer))!=-1){
//            //3.把读取到的字节数组转换成字符串输出，读取多少，倒出来多少
//            String str = new String(buffer,0,len);
//            System.out.print(str);
//        }
        //拓展 每次读取多个字节，性能得到提升
        //依然无法避免读取汉字输出乱码的问题，存在截断汉字字节的可能性
        //一次性读完，适用于小文件 可以避免汉字被截断产生乱码问题
        FileInputStream fileInputStream1=new FileInputStream( "D:\\Development\\work_space\\IDEADemo\\day11-file-io\\src\\a.txt");
        byte[] bytes = fileInputStream1.readAllBytes();
        String str1 = new String(bytes);
        System.out.println(str1);
    }
}
