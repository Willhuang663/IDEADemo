package com.hhy.stringDemo;

public class Test2 {
    static void main() {
        //生成验证码
        String code=getCode(5);
        System.out.println(code);

    }
    public static String getCode(int n){
        //定义一个变量存储所有的字符
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        //把字符串转化为字符数组
        //char[]chars=str.toCharArray();
        //定义一个变量用于记住验证码的随即次序
        String code="";
        //3.循环n次，每次生成一个随机字符加入到code中
        for(int i=0;i<n;i++){
            int index=(int) (Math.random()*str.length());
            //Math.random的范围是[0,1)*50=[0,49]
            //4.根据索引获取随机字符
            code+=str.charAt(index);
        }
        return  code;
    }
}
