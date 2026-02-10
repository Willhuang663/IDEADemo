package com.hhy.demo2recursion;

public class Test1 {
    static void main() {
        //递归  可能出现死循环 导致出现栈内存溢出的现象

    }
    public static void  print(int n){
        if(n>0){
            System.out.println(n);
            print(n-1);
        }
    }
}
