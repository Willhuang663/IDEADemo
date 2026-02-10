package com.hhy.extends2modify;

public class Test extends Fu {
    static void main() {
        //认识四种权限修饰符的范围

        Fu fu1=new Fu();
        fu1.Method();
        fu1.publicMethod();
        fu1.protectedMethod();
    }
}
