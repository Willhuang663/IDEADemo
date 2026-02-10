package com.hhy.demo11bufferedWriter;

import java.io.*;

public class Test3 {
    public  static final String SRC_Path="D:\\Development\\work_space\\IDEADemo\\day11-file-io\\src\\a.txt";
    public  static final String DEC_Path="D:\\Development";
    static void main() {
        //缓冲流和低级六性能分析
        //1.使用低级的字节流一个字节一个字节的复制
        copyFile1();
        //2.使用低级的字节流按照字节数组的形式复制文件
        copyFile2();
        //3.使用高级的缓冲字节流奥找一个个字节的形式复制文件
        copyFile3();
        //4.使用高级的缓冲字节流按照字节数组的形式复制文件
        copyFile4();


    }



    public static void copyFile1(){
        //系统当前时间
        long time1 = System.currentTimeMillis();//此刻的时间毫秒值
        try (
                InputStream is = new FileInputStream(SRC_Path);
                OutputStream os=new FileOutputStream(DEC_Path+"1.txt")
        ) {
            int b;
            while((b=is.read())!=-1){
                os.write(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long time2 = System.currentTimeMillis();
        System.out.println("1耗时:"+(time2-time1)/1000.0+"s");
    }
    public static void copyFile2(){
        //系统当前时间
        long time1 = System.currentTimeMillis();//此刻的时间毫秒值
        try (
                InputStream is = new FileInputStream(SRC_Path);
                OutputStream os=new FileOutputStream(DEC_Path+"2.txt")
        ) {
            int len; // 声明变量：存储「每次实际读取的字节数」
            byte []bytes=new byte[1024];//1kb
            while((len=is.read(bytes))!=-1){//记录每次读多少字节
                os.write(bytes,0,len);//读多少，写多少
                //bytes指的是要写入的字节数组
            }
            /*
            * is.read(bytes)：从源文件读取 5 字节（A、B、C、D、E），填充到 bytes 数组中；
               → bytes 里的内容：[A, B, C, D, E]；
            → len = 5（实际装了 5 字节）；
            os.write(bytes, 0, len)：从 bytes 这个容器里，从第 0 位开始，取 5 字节（A-E）写入目标文件；
            → 目标文件此时内容：ABCDE。
            步骤 2：第二次循环
            is.read(bytes)：再从源文件读取 5 字节（F、G、H、I、J），填充到 bytes 数组中；
            → bytes 里的内容：[F, G, H, I, J]；
            → len = 5；
            os.write(bytes, 0, len)：写入 F-J → 目标文件：ABCDEFGHIJ。
            *步骤 3：第三次循环（最后一次，装不满容器）
            is.read(bytes)：源文件只剩 4 字节（K、L、M、N），填充到 bytes 数组前 4 位；
            → bytes 里的内容：[K, L, M, N, J]（注意：第 5 位还是上一次的 J，是空的无效数据）；
            → len = 4（实际只装了 4 字节）；
            *
            * */
        } catch (Exception e) {
            e.printStackTrace();
        }
        long time2 = System.currentTimeMillis();
        System.out.println("2耗时:"+(time2-time1)/1000.0+"s");
    }
    public static void copyFile3(){
        //系统当前时间
        long time1 = System.currentTimeMillis();//此刻的时间毫秒值
        try (
                InputStream is = new FileInputStream(SRC_Path);
                OutputStream os=new FileOutputStream(DEC_Path+"3.txt");
                InputStream bufferedInputStream=new BufferedInputStream(is);
                OutputStream bufferedOutputStream=new BufferedOutputStream(os);

        ) {
            int len;
            while((len=bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long time2 = System.currentTimeMillis();
        System.out.println("3耗时:"+(time2-time1)/1000.0+"s");
    }
    public static void copyFile4(){
        //系统当前时间
        long time1 = System.currentTimeMillis();//此刻的时间毫秒值
        try (
                InputStream is = new FileInputStream(SRC_Path);
                OutputStream os=new FileOutputStream(DEC_Path+"4.txt");
                InputStream bufferedInputStream=new BufferedInputStream(is);
                OutputStream bufferedOutputStream=new BufferedOutputStream(os);

        ) {
            int len;
            byte []bytes=new byte[1024];//1kb
            while((len=bufferedInputStream.read(bytes))!=-1){//记录每次读多少字节
                bufferedOutputStream.write(bytes,0,len);//读多少，写多少
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long time2 = System.currentTimeMillis();
        System.out.println("4耗时:"+(time2-time1)/1000.0+"s");
    }
}
