package com.hhy.demo;

import java.util.Scanner;

public class Test {
    static void main() {
        //加油站支付小项目
        //1.创建卡片类
        //2.定义一个卡片父类：card,定义金卡和银卡的共有属性
        //3.定义一个金卡类和银卡类继承card，金卡重写消费方法（8折优惠）
        //4.办一张金卡 创建金卡对象、交给一个独立的业务：存款、消费。
        GoldCard goldCard=new GoldCard("1001","张三","123456",5000);
        pay(goldCard);
        SilverCard silverCard=new SilverCard("1002","李四","123456",2000);
        pay(silverCard);
    }
    //支付:用一个方法来刷卡 可能接受金卡也可能接受银卡
    public static void pay(Card card){
        System.out.print("请刷卡,输入您的消费金额:");
        Scanner scanner=new Scanner(System.in);
        //接受输入的金额
        double money=scanner.nextDouble();
        card.useMoney(money);


    }
}
