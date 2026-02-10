package com.hhy.extends6constructor;

public class Test {
    //子类构造器的特点以及应用的场景
    //子类的构造器必须会调用父类的构造器，在执行自己的构造器

    static void main() {
        Zi zi=new Zi();
    }
}

class Zi extends Fu{
    public Zi() {
        //super();默认存在的，写不写都一样
        System.out.println("子类");
    }
}
class Fu{
    public Fu() {
        System.out.println("父类");
    }
}
