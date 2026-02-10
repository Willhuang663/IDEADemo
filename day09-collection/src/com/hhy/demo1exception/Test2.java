package com.hhy.demo1exception;

public class Test2 {
    static void main() {
        System.out.println("程序开始运行");
        try {
            System.out.println(div(10,0));
            System.out.println("底层方法执行成功了");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层方法执行失败");
        }
        System.out.println("程序运行结束");
    }
    public static int div(int a,int b) throws Exception {
        if(b==0){
            System.out.println("除数不能为0，参数有问题!");
            //可以返回一个异常给上层的调用者，返回的异常还能告知上层底层是执行成功了还是执行失败了
            throw  new Exception("除数不能为0，参数有问题");
        }
        int result=a/b;
        return result;
    }
}
