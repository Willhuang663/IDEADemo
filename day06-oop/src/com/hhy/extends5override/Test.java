package com.hhy.extends5override;

public class Test {
    //1.方法的重写
    static void main() {
       Cat cat=new Cat();
       cat.cry();

    }
}
class Cat extends Animal{
    //方法重写： 方法名称、形参列表必须一样 这个就是方法的重写
    //声明不变，重新实现。
    @Override //方法重写的标志注解：要求方法名称和列表必须和被重写方法名称、参数列表保持一致
    public void cry(){
        System.out.println("小猫喵喵叫");
    }

}

class Animal{
    public void cry(){
        System.out.println("动物会叫");
    }
}
