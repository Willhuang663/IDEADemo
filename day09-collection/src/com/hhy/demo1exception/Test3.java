package com.hhy.demo1exception;

import java.util.Scanner;

public class Test3 {
    static void main(){
        //自定义异常
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年龄:");
        int age=scanner.nextInt();
        try {
            saveAge(age);
        } catch (AgeIllegalException e) {
            e.printStackTrace();
        }
        try {
            saveAge(200);
            System.out.println("执行成功");
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("执行失败");
        }
    }

    //
    public  static void saveAge(int age) throws AgeIllegalException {
        if(age<0||age>150){
            //年龄非法，目的：抛出去异常提醒
            throw new AgeIllegalException("年龄非法");
        }else {
            System.out.println("年龄合法");
            System.out.println(age);
        }
    }
}
