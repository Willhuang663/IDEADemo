package com.hhy.demo1file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Test1 {
    //创建file对象创建文件(文件/目录)，搞清楚提供的对文件进行操作的方法
    static void main() throws Exception {
        //创建file对象获取某个文件的信息
        File file=new File("D:\\Development\\resource\\cat.jpg");
        File file1=new File("D:/Development/resource/cat.jpg");
        System.out.println(file1.length());//字节个数
        System.out.println(file1.getName());//文件的名称
        System.out.println(file1.isFile());//判断是否是文件
        System.out.println(file1.isDirectory());//判断是否是文件夹
        //2.相对路径定位文件对象
        //只要带盘符都称为绝对路径D:/Development/resource/cat.jpg
        //相对路径:不带盘符，默认是到你的idea工程下直接寻找文件，一般用来找工程下的项目文件
        //绝对路径
        File file2=new File("D:\\Development\\work_space\\IDEADemo\\day11-file-io\\src\\a.txt");
        //相对路径
        File file3=new File("day11-file-io\\src\\a.txt");
        System.out.println(file2.length());
        System.out.println(file3.length());

        //创建对象代表不存在的文件路径
        File file4=new File("D:\\Development\\work_space\\IDEADemo\\day11-file-io\\src\\b.txt");
        System.out.println(file4.exists());//判断当前文件是否存在
        System.out.println(file4.createNewFile());//创建新文件
        //4.创建对象代表不存在的文件夹路径
        File file5=new File("D:\\Development\\work_space\\IDEADemo\\day11-file-io\\src\\aaa");
        System.out.println(file5.exists());
        System.out.println(file5.mkdir());//创建文件夹  mkdir创建的是一级文件夹

        File file6=new File("D:\\Development\\work_space\\IDEADemo\\day11-file-io\\src\\bbb\\ccc");
        System.out.println(file6.mkdirs());//创建多级文件夹

        //5.创建file对象代表存在的文件，然后删除它
        File file7=new File("D:\\Development\\work_space\\IDEADemo\\day11-file-io\\src\\b.txt");
        System.out.println(file7.delete());//删除文件
        File file8=new File("D:\\Development\\work_space\\IDEADemo\\day11-file-io\\src\\aaa");
        System.out.println(file8.delete());//只能删除空文件夹 不能删除非空文件夹
        //6.可以获取到某个文件夹下的全部一级目录
        File file9=new File("D:\\Development");
        String[] fileNames = file9.list();
        System.out.println(Arrays.toString(fileNames));
        File[] files = file9.listFiles();//当前目录下的所有一级文件对象到一个文件对象数组当中
        for (File f:files){
            System.out.println(f.getAbsoluteFile());//获取绝对路径
        }
    }
}
