package com.hhy.demo2recursion;

public class Test2 {
    static void main() {
        //计算n的阶乘
        System.out.println(f(5));
        System.out.println(a(5));
    }
    public static int f(int n){
        if(n==1){
            return 1;
        }else {
            return f(n-1)*n;
        }
    }
    public static int a(int n){
        if(n==1){
            return 1;
        }else {
            return a(n-1)+n;
        }
    }
}
