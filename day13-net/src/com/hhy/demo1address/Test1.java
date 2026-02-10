package com.hhy.demo1address;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test1 {
    static void main() {
        //InetAddress获取本机 IP对象和对方IP对象
        //1.获取本机IP
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
            System.out.println(localHost.getHostName());
            System.out.println(localHost.getHostAddress());
            //2.获取对方IP对象
            InetAddress ip2 = InetAddress.getByName("www.baidu.com");
            System.out.println(ip2);
            System.out.println(ip2.getHostName());
            System.out.println(ip2.getHostAddress());
            //3.判断本机与对方主机是否连通
            System.out.println(ip2.isReachable(5000));//ping
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
