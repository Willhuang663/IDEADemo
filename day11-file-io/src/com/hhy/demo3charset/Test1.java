package com.hhy.demo3charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test1 {
    static void main() throws Exception {
        //程序实现字符编码和解码
        String str="hello world,你好世界";
        //UTF-8中汉字占3个字节，英文+数字占1个
        byte[] bytes = str.getBytes();//平台的UTF-8字符集
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));
        //GBK编码
        byte[] bytes1 = str.getBytes("GBK");//指定GBK进行编码
        System.out.println(bytes1.length);//GBK一个汉字占2个字节
        System.out.println(Arrays.toString(bytes1));
        System.out.println("================解码===============");
        //UTF-8解码
        String s = new String(bytes);
        System.out.println(s);

        //指定GBK解码
        String s1 = new String(bytes1,"GBK");
        System.out.println(s1);



    }
}