package com.hhy.demo6copy;

import java.io.*;

public class Test2 {
    //文件复制
    static void main()  {
        //使用字节流完成文件的复制操作
        //源文件
        copyPicture("D:\\Development\\resource\\cat.jpg","D:\\Development\\resource\\cat-copy.jpg");
    }
    public static void copyPicture(String strPath,String destPath)  {

        //1.创建文件输入流管道与源文件接通
        try(
                //新写法 自动关闭 关闭资源的新方式
                //这里只能放置资源对象，用完后会自动调用close方法关闭
               InputStream fileInputStream=new FileInputStream(strPath);
               OutputStream fileOutputStream=new FileOutputStream(destPath);
                ) {

            //读入一个字节数组 写入一个字节数组  1024+1024+3
            byte[] bytes=new byte[1024];
            int len;
            while((len=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,len);//读取多少字节就写入多少字节
            }
            System.out.println("复制成功");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
