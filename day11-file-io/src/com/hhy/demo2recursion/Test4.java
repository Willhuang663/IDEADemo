package com.hhy.demo2recursion;

import java.io.File;
import java.io.IOException;

public class Test4 {
    static void main() {
        //文件递归
        File file=new File("D:\\");

        try {
            search(file,"QQ.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 搜索文件
     * @param dir 搜索的文件夹
     * @param fileName //搜索的名称
     */
    public static void search(File dir,String fileName) throws IOException {
        //1.判断极端
        if(dir==null||!dir.exists()||dir.isFile()){
            return;//不搜索的情况
        }
        //2.存在合理的目录 开始合理的搜搜
        //获取文件夹下的所有一级文件夹对象
        File[] files = dir.listFiles();

        //3.判断当前目录下是否存在一级文件对象，存在才可以便利
        if(files!=null&&files.length>0){
            //4.开始遍历
            for(File file:files){
                //5.判断当前文件对象是否是对象
                if(file.isFile()){
                    if(file.getName().contains(fileName)){
                        System.out.println("找到文件:"+file.getAbsolutePath());
                        //启动程序 必须是exe结尾才可以  图片不可以启动
                        Runtime runtime=Runtime.getRuntime();
                        runtime.exec(file.getAbsolutePath());
                    }
                }else{
                    search(file,fileName);
                }
            }
        }

    }
}
