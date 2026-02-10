package com.hhy.demo1junit;



//测试类：JUnit单元测试框架，对业务类中的方法进行正确性测试
public class getLengthUtilTest {
    //测试方法：必须是公共的，无参，无返回值
    //测试方法必须加上@Test注解

    public void test1(){
        getLengthUtil.demo1("你好");
    }

}
