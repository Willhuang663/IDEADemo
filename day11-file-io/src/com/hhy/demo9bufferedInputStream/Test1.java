package com.hhy.demo9bufferedInputStream;

import java.io.*;

public class Test1 {
    //文件复制
    static void main()  {
        //使用字节流完成文件的复制操作
        //源文件
        copyPicture("D:\\Development\\resource\\cat.jpg","D:\\Development\\resource\\cat-copy1.jpg");
    }
    public static void copyPicture(String strPath,String destPath)  {

        //1.创建文件输入流管道与源文件接通
        try(
                //新写法 自动关闭 关闭资源的新方式
                //这里只能放置资源对象，用完后会自动调用close方法关闭

                InputStream fileInputStream1=new FileInputStream(strPath);
                //把低级的字节输入流包装成为高级的缓冲字节输入流
                InputStream fileInputStream=new BufferedInputStream(fileInputStream1);
                OutputStream fileOutputStream1=new FileOutputStream(destPath);
                //把低级的字节输出流包装成为高级的缓冲字节输出流
                OutputStream fileOutputStream=new BufferedOutputStream(fileOutputStream1);
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
