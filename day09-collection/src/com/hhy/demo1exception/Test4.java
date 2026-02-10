package com.hhy.demo1exception;

public class Test4 {
    //运行时异常
    static void main() {
        try {
            saveAge1(1000);
            System.out.println("成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("失败");
        }
    }
    public static void saveAge1(int age){
        if(age<0||age>=150){
            throw new AgeIllegalRunTimeException("非法年龄");

        }else{
            System.out.println(age);
        }
    }
}
