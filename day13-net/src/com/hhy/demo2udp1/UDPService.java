package com.hhy.demo2udp1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPService {
    static void main() throws IOException {
        System.out.println("服务端启动============================");
        //服务端开发 接收数据
        //1.创建接收端对象，注册端口
        DatagramSocket datagramSocket=new DatagramSocket(8080);
        //2.创建一个数据包对象负责接收数据(数据盘子)
        byte[]bytes=new byte[1024*64];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        //3.接收数据，将数据封装到数据包对象的字节数组中去
        datagramSocket.receive(datagramPacket);
        //4.查看接受的数据
        //获取当前收到的数据长度
        int length = datagramPacket.getLength();
        String string = new String(bytes,0,length);
        System.out.println("接受的数据为:"+string);
        //获取对方的ip对象和程序端口
        String ip = datagramPacket.getAddress().getHostAddress();
        int port = datagramPacket.getPort();
        System.out.println(ip);
        System.out.println(port);

        datagramSocket.close();
    }
}
