package com.hhy.demo1file;

import java.io.File;

public class Test2 {
    static void main() {
        //File遍历一级文件对象的操作
        File dir=new File("D:\\Development");
        System.out.println(dir.exists());
    }
}
