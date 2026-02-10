package com.hhy.demo5genericity;

import java.util.ArrayList;

public class Test {
    static void main() {
        //泛型和集合不支持8种基本数据类型 只支持引用类型(对象类型)
        //泛型擦除：泛型工作在编译阶段，等编译后泛型就没用了，所有类型会恢复成Object类型
        //ArrayList<int>arrayList=new ArrayList<int>();
       // arrayList.add(12);
        //编译完成后
        //Object o=12;编译完成之后，底层要接收Object类型的对象，不能接收整数
        //包装类 把基本类型的数据包装成对象类型的数据
        /*
        *  基本数据类型(8种)	包装类（引用类型）	示例数组
             int	    Integer	             Integer[] arr
             double	    Double	              Double[] arr
            char	    Character	         Character[] arr
            boolean	    Boolean	            Boolean[] arr
       *     string     String              String []arr
       *
        * */
        //手工包装
        Integer i=new Integer(10);//过时
        Integer a=Integer.valueOf(10);//推荐

        //自动包装 基本数据类型的数据可以直接变成包装类型的数据，不需要做额外操作
        Integer b=100;

        //自动拆箱：把包装类型的对象直接给基本类型的数据
        int c=b;
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(100);//自动装箱
        arrayList.add(200);//自动装箱
        int a1=arrayList.get(1);//自动拆箱
        System.out.println("================================");
        //包装类新增的功能
        //1.把基本类型的数据转化为字符串
        int j=123;
        String string = Integer.toString(j);//"123"
        System.out.println("==============");
        Integer j1=j;
        String string1 = j1.toString();
        System.out.println("==============");
        String  string3=j+"";//直接转换
        System.out.println("==========");
        //2.把字符串数值转化为真实的数据类型！！！！
        String str="100";
        int parseInt = Integer.parseInt(str);
        int i1 = Integer.valueOf(str);
        String str2="98.8";
        double parseDouble = Double.parseDouble(str2);
        Double aDouble = Double.valueOf(str2);
        System.out.println(parseInt);
        System.out.println(i1);
        System.out.println(parseDouble);
        System.out.println(aDouble);
    }
}
