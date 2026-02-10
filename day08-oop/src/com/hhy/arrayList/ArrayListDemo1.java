package com.hhy.arrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    static void main(String[] args) {
        //arraylist的基本使用
        //添加数据 查看数据 删除数据 修改数据
        //创建ArrayList对象，代表一个人集合容器 <泛型>
        ArrayList<String> arrayList=new ArrayList();
        //添加数据
        arrayList.add("你好");
        arrayList.add("再见");
        arrayList.add("你好1");
        arrayList.add("再见1");
        System.out.println(arrayList);
        //查看数据
        System.out.println(arrayList.get(0));
        //遍历集合
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        //删除数据
        arrayList.remove(1);//根据索引删除数据
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        arrayList.remove("你好1");//根据元素删除
        System.out.println(arrayList);

        //修改数据
        arrayList.set(0,"修改过的数据");
        System.out.println(arrayList);
    }
}
