package com.hhy.demo4genericity;

public class Test1 {
    //泛型方法作用
    //打印任意数字的内容
    //注意 ；泛型 <T> 只支持引用数据类型(比如 String、Integer、Object、自定义类等)，
    // 不支持基本数据类型(int、double、char、boolean 等)
    /*
    *基本数据类型
    * 整数byte short int long 1 2 4 8
    * 小数float double 4 8
    * 字符char 2
    * 布尔boolean 1
    *    基本数据类型(8种)	包装类（引用类型）	示例数组
             int	    Integer	             Integer[] arr
             double	    Double	              Double[] arr
            char	    Character	         Character[] arr
            boolean	    Boolean	            Boolean[] arr
       *     string     String              String []arr
       *
    *
    * */
    static void main() {
        String strs[]=new String[3];
        strs[0]="张三";
        strs[1]="李四";
        strs[2]="王五";
        Integer arrs[]=new Integer[3];
        arrs[0]=1;
        arrs[1]=2;
        arrs[2]=3;
        printArray(strs);
        printArray(arrs);


    }
    public static<T> void printArray(T[]names){
        for (T t:names){
            System.out.println(t);
        }
    }
}

























