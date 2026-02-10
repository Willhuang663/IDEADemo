package com.hhy.extends2modify;

public class Fu {
    /*
    * private 只能本类
    * 缺省 本类 同一个包下的类
    * protected 本类 同一个包小的类
    * public 任意范围
    * */
    private void privateMethod(){
        System.out.println("privateMethod");
    }
     void Method(){
        System.out.println("Method");
    }
    protected void protectedMethod() {
        System.out.println("protectMethod");
    }
    public void publicMethod(){
        System.out.println("publicMethod");
    }

    static void main() {
        Fu fu=new Fu();
        fu.Method();
        fu.privateMethod();
        fu.publicMethod();
        fu.protectedMethod();
    }
}
