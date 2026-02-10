package com.hhy.demo2udp1;

import java.io.IOException;
import java.net.*;

public class UDPClient {
    static void main() throws IOException {
        //实现UDP通信 一发一收 客户端开发
        //1.创建发送端对象(代表扔数据的人)
        System.out.println("客户端启动============================");
        DatagramSocket socket=new DatagramSocket();
        //2.创建数据包对象，封装要发送的数据(数据装在盘子中，创建盘子)
        byte[] bytes="hello world".getBytes();
        /**
         * 参数1：发送的数据
         * 参数2:发送的长度
         * 参数3：发送的目的地
         * 参数4：服务端程序的端口号
         */
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),8080);

        //3.发送端对象开始发送数据
        socket.send(datagramPacket);
        socket.close();

    }
}
