package com.hhy.demo11bufferedWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    static void main(){
        //1.创建一个缓冲字符输入流对象与源文件相接
        BufferedReader bufferedReader= null;
        BufferedWriter bufferedWriter= null;
        try {
            bufferedReader = new BufferedReader(new FileReader("D:\\Development\\work_space\\IDEADemo\\day11-file-io\\src\\demo.txt"));
            //
             bufferedWriter=new BufferedWriter(new FileWriter("D:\\Development\\work_space\\IDEADemo\\day11-file-io\\src\\demo-out.txt"));
            //2.准备list集合存储文件
            List<String> list=new ArrayList<>();
            String line;
            //3.按照行读取数据，存入到data中
            while((line=bufferedReader.readLine())!=null){
                list.add(line);
            }
            //4.集合中的数据排序
            //Collections.sort(list);
            Collections.sort(list,(o1, o2) -> o1.charAt(0)-o2.charAt(0));
            //System.out.println(list);
            //5.遍历集合，将集合中的每一段文字加入到目标文件
            for(String str:list){
                bufferedWriter.write(str);
                bufferedWriter.newLine();//换行
            }
            System.out.println("写入成功");
        } catch (Exception e) {
           e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
