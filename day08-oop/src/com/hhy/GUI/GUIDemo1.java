package com.hhy.GUI;

import javax.swing.*;

public class GUIDemo1 {
    static void main() {
        //认识GUI Swing 编程
        //1.创建一个窗口，有一个登陆的按钮
        JFrame jFrame=new JFrame("登录窗口");
        JPanel jPanel=new JPanel();//创建一个面板
        jFrame.add(jPanel);//将面板添加到窗口中
        jFrame.setSize(400,400);//设置窗口的大小
        jFrame.setLocationRelativeTo(null);//设置窗口居中
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口退出程序
        JButton jButton=new JButton("登录");
        jButton.setBounds(100,100,100,50);//设置按钮的位置
        jPanel.add(jButton);
        jFrame.setVisible(true);



    }
}
