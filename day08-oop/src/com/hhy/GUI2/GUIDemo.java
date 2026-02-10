package com.hhy.GUI2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GUIDemo {
    static void main() {
       //GUI的处理机制
        JFrame jFrame=new JFrame("登录窗口");
        JPanel jPanel=new JPanel();//创建一个面板
        jFrame.add(jPanel);//将面板添加到窗口中
        jFrame.setSize(400,400);//设置窗口的大小
        jFrame.setLocationRelativeTo(null);//设置窗口居中
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口退出程序
        JButton jButton=new JButton("登录");
        jButton.setBounds(100,100,100,50);//设置按钮的位置
        jPanel.add(jButton);//将按钮添加到面板中

        //给按钮绑定点击事件监听器对象
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //一旦点击按钮，就会触发方法的执行
                System.out.println("1111");
                //e是点击事件 封装了事件的相关信息
                System.out.println(e);
                JOptionPane.showMessageDialog(jFrame,"有人点击了登录按钮");
            }
        });
        //监听用户上下左右的按键事件
        jFrame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //获取按键的编码
                int keyCode=e.getKeyCode();
                //判断编码是上下左右
                if(keyCode==KeyEvent.VK_UP){
                    System.out.println("用户点击了上");
                } else if (keyCode==KeyEvent.VK_DOWN) {
                    System.out.println("用户点击了下");
                } else if (keyCode==KeyEvent.VK_LEFT) {
                    System.out.println("用户点击了左");
                }else {
                    System.out.println("用户点击了右");
                }
            }
        });
        jFrame.setVisible(true);//显示窗口
        //让窗口成为焦点
        jFrame.requestFocus();

    }
}
