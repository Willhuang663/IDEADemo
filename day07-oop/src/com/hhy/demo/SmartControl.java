package com.hhy.demo;

public class SmartControl {
    public  void printAllStatus(Device[] devices) {
        for (Device device:devices){
            System.out.println(device.getName()+"的状态为:"+(device.isStatus()?"打开":"关闭"));
        }
    }

    public  void control(Device device){

        //按下开关
        device.press();
        System.out.println("操作成功");
        System.out.println(device.getName()+"状态修改为:"+device.isStatus());
        System.out.println("==============================");

    }

}
