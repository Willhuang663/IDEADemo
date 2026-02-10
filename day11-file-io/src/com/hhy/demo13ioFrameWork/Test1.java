package com.hhy.demo13ioFrameWork;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test1 {
    static void main() throws IOException {
        //io框架的使用
        FileUtils.copyFile(new File("D:\\Development\\resource\\cat.jpg"),new File("D:\\Development\\resource\\cat-copy.jpg"));


    }
}
