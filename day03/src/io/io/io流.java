package io.io;

import java.io.*;

public class io流 {
    //掌握字节输入流读文件中的字节数组到内存中去的操作
    public static void main(String[] args) throws IOException {
        //1.创建文件字节输入流管道于源文件接通
        InputStream is = new FileInputStream(new File("day03\\src\\liele.txt"));
        InputStream is1 = new FileInputStream("day03\\src\\liele.txt");
        System.out.println(is==is1);
        System.out.println(is.getClass());
//2.读取文件中的字节并输出到控制台
        //定义一个变量记住读取的字节个数
//        int b;//存储每次读取的字节
//        while ((b=is.read())!=-1){//循环读取
//            System.out.print(b);//输出字节
//            System.out.print((char)b);                    垃圾代码
//
//        }//循环结束，文件读取完毕
        //每次读取一个字节的问题:性能较差,读取汉字输出一定会乱码!
    }
}
