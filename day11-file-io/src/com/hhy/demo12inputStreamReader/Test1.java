package com.hhy.demo12inputStreamReader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test1 {
    static void main() {
        //解决不同编码时，字符流读取文本内容出现乱码的问题

        try (
                //1.先获取文件的原始字节流
                InputStream is=new FileInputStream("day11-file-io\\src\\demo12.txt");
                //指定编码把字节流转换成字符输入流
                InputStreamReader inputStreamReader=new InputStreamReader(is, "GBK");
              //  FileReader fileWriter=new FileReader("day11-file-io\\src\\demo12.txt");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                )
        {
            String line;
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
