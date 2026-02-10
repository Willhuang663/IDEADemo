package com.hhy.extends1demo;

public class Test {
    static void main() {
        /*
        * java面向对象的三大特性是封装、继承和多态
        *  封装
       核心：藏细节、保安全、对外留接口，本质是把属性和方法打包，私有化属性，提供公共访问方法。
      口诀：属性私有，get/set 公开。
      *  继承
     核心：子类复用父类代码，扩展自己的功能，本质是代码的复用和扩展。
    口诀：父类写共性，子类写个性。
        *多态
     核心：同一个行为，不同对象，表现不同形态，本质是父类引用指向子类对象，调用重写方法。
     口诀：编译看左边，运行看右边。
        * */
        //继承
        Teacher teacher=new Teacher();
        teacher.setName("张三");
        teacher.setSex('男');
        teacher.setSkill("写代码");
        System.out.println(teacher.getName());
        System.out.println(teacher.getSkill());
    }
}
