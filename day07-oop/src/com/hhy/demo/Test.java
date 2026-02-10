package com.hhy.demo;

import java.util.Scanner;

public class Test {
    //面向对象---智能家居控制系统案例
    //角色:设备(吊灯、电视机、洗衣机、电饭煲)
    //具备的功能:开关
    //由谁来控制:智能控制系统(单例对象) 控制调用设备的开和关闭
    //1.定义设备类:创建设备对象代表家里的设备
    //2.准备这些设备的对象，放到数组中，代表整个家庭的设备
    static void main() {
        Device [] devices=new Device[3];
        devices[0]=new TV("小米电视机",true);
        devices[1]=new Lamp("小米台灯",true);
        devices[2]=new WashMeachine("小米洗衣机",false);
        //3.为每个设备制定开和关的功能，定义一个接口 家电实现
        //4.创建智能控制系统对象，控制设备的开和关闭
        SmartControl smartControl=new SmartControl();
        //5.处理电视机
        //smartControl.control(devices[0]);
        //6.提示用户操作 展示全部设备的状态 、让用户可以操作哪一个进行选择
        while(true){
            smartControl.printAllStatus(devices);
            Scanner scanner=new Scanner(System.in);
            System.out.print("请输入你操作的对象:");
            String id=scanner.next();
            switch (id){
                case "0":
                    smartControl.control(devices[0]);
                    break;
                case "1":
                    smartControl.control(devices[1]);
                    break;
                case "2":
                    smartControl.control(devices[2]);
                    break;
                case "exit":
                    System.out.println("退出");
                    return;
                default:
                    System.out.println("输入有误，请重新输入!");
            }
        }
    }
}
