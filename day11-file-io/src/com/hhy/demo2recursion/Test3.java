package com.hhy.demo2recursion;

public class Test3 {
    static void main() {
        //递归解决 猴子吃桃问题
        System.out.println("第一天摘得桃子数量是:"+f(1));
    }
    public static int f(int a){
        if(a==10){
            return 1;
        }else{
            return 2*f(a+1)+2;
        }
    }
}
