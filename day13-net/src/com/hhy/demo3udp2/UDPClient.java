package com.hhy.demo3udp2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
    static void main() throws IOException {
        //实现UDP通信 多发多收 客户端开发
        //1.创建发送端对象(代表扔数据的人)
        System.out.println("客户端启动============================");
        DatagramSocket socket=new DatagramSocket();
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("请输入数据");
            //2.创建数据包对象，封装要发送的数据(数据装在盘子中，创建盘子)
            String str=scanner.nextLine();//范围更大，避免空格的影响
            //如果输入exit
            if(str.equals("exit")){
                System.out.println("用户选择退出");
                socket.close();
                break;
            }
            byte[] bytes=str.getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),8080);
            //3.发送端对象开始发送数据
            socket.send(datagramPacket);
        }
    }
}
