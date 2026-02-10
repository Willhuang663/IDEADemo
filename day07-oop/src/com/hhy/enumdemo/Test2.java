package com.hhy.enumdemo;

public class Test2 {
    static void main() {
        //掌握枚举应用场景：信息的分类和标记
        //模拟上下左右移动方向
        //第一种常量做信息标志和分类：但参数值不受约束
        move(Constant.up);
        //第二种是枚举做信息标志和分类
        move2(Direction.up);
    }

    public static void move(int a ){
        //根据方向做移动，上下左右
        switch (a){
            case Constant.up:
                System.out.println("向上移动");
                break;
            case Constant.down:
                System.out.println("向下移动");
                break;
            case Constant.left:
                System.out.println("向左移动");
                break;
            case Constant.right:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }

    public static void move2(Direction direction){
        //根据方向做移动，上下左右
        switch (direction){
            case up:
                System.out.println("向上移动");
                break;
            case Direction.down:
                System.out.println("向下移动");
                break;
            case Direction.left:
                System.out.println("向左移动");
                break;
            case Direction.right:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}
