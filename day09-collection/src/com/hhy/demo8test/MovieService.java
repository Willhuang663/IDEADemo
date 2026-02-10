package com.hhy.demo8test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {
    //用于存储电影的集合
    private List<Movie>list=new ArrayList<>();
    private Scanner scanner=new Scanner(System.in);
    public void start() {
        while (true) {
            System.out.println("=====电影信息操作系统=====");
            System.out.println("1.增加电影");
            System.out.println("2.搜索电影");
            System.out.println("3.查看全部电影");
            System.out.println("4.下架电影信息");
            System.out.println("5.修改电影信息");
            System.out.println("6.退出");
            System.out.println("请输入操作方式:");
            String id=scanner.next();
            switch (id){
                case "1":
                    //1.增加电影
                    addMovie();
                    break;
                case "2":
                    //搜索电影
                   queryMovie();
                   break;
                case "3":
                    //查看全部电影
                    queryAllMovies();
                    break;
                case "4":
                    //下架某个电影
                    removeMovie();
                    break;
                case "5":
                    //更新信息
                    updateMovie();
                    break;
                case "6":
                    System.out.println("退出成功");
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }
    }

    private void updateMovie() {
        System.out.println("请输入修改信息的编号:");
        int id=scanner.nextInt();
        Movie movie=list.get(id);
        System.out.println("请输入电影的名称:");
        movie.setName(scanner.next());
        System.out.println("请输入电影的主演:");
        movie.setActor(scanner.next());
        System.out.println("请输入电影的价格:");
        movie.setPrice(scanner.nextDouble());
        System.out.println("请输入电影的评分:");
        movie.setScore(scanner.nextDouble());
        System.out.println("修改成功");
        queryAllMovies();
    }

    private void removeMovie() {
        //获取输入的名称，只要包括名称就要删除
        System.out.println("请输入主演:");
        String name=scanner.next();
        for (int i=0;i<list.size();i++){
            Movie movie=list.get(i);
            if(movie.getActor().contains(name)){
                list.remove(movie);
                i--;
            }
        }
        System.out.println("下架成功");
        queryAllMovies();
    }

    private void queryAllMovies() {
        System.out.println("==================");
       if (list.size()!=0){
           for (Movie movie:list){
               System.out.println(movie);
           }
       }else{
           System.out.println("信息为空，请添加信息");
       }

    }

    private void queryMovie() {
        //搜索电影信息
        System.out.println("请输入搜索的电影名称:");
        String name=scanner.next();
        Movie movie = queryByName(name);
        if(movie!=null){
            System.out.println("查询成功");
            System.out.println(movie);
        }else {
            System.out.println("查询失败");
        }

    }

    private   Movie queryByName(String name) {
        for (Movie m:list){
            if(m.getName().equals(name)){
                return m;
            }
        }
        return null;
    }

    private void addMovie() {
        Movie movie=new Movie();
        System.out.println("请输入电影的名称:");
        movie.setName(scanner.next());
        System.out.println("请输入电影的主演:");
        movie.setActor(scanner.next());
        System.out.println("请输入电影的价格:");
        movie.setPrice(scanner.nextDouble());
        System.out.println("请输入电影的评分:");
        movie.setScore(scanner.nextDouble());
        //把对象加入到集合中
        list.add(movie);
        System.out.println("电影信息添加成功");

    }
}
