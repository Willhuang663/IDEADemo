package com.hhy.test;

import java.util.Random;
import java.util.Scanner;

public class Demo04 {
    static void main() {
        //获取10个1-100之间的随机数并存入到数组当中，要求保证数据是唯一的
        //创建数组
        int[] arr=new int[10];
        Random random = new Random();
        //Random.nextDouble()无参数，调用后默认返回一个 [0.0, 1.0) 区间的随机小数
        for(int i=0;i<arr.length;){
            int num = random.nextInt(100) + 1; // nextInt(100)生成0~99，+1后是1~100
            //nextInt(a, b)：生成[a, b)范围的数（比如nextInt(10,101)是 10~100）。
            //判断生成的这个随机数是否存在于当前的数组中
            boolean flag=getExist(num,arr);
            //当前随机数在数组中不存在
            if(!flag){
                arr[i]=num;
                i++;
            }
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
    static boolean getExist(int num, int[] arr){
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                return true;
            }
        }
        return false;
    }

}
