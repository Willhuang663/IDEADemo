package com.hhy.demo1exception;
//自定义编译时的异常
//1.继承Exception
//2.重写父类的构造器
//3.哪里需要用这个异常返回，哪里就throw
public class AgeIllegalException extends Exception {


    public AgeIllegalException() {
    }

    public AgeIllegalException(String message) {
        super(message);
    }
}
