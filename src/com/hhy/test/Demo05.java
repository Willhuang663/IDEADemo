package com.hhy.test;

import java.util.Scanner;

public class Demo05 {
    static void main() {
        printArr();
    }
    static void printArr(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }


}
