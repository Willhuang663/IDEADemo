package com.hhy.demo2genericity;

import java.util.ArrayList;

//泛型类
public class MyArrayList <E>{
    private ArrayList list=new ArrayList();
    Object []arr=new Object[10];
    public boolean add(E e){
        list.add(e);
        return true;
    }
    public boolean remove(E e){
        list.remove(e);
        return true;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
