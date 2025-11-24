package io.io;

import java.io.*;

public class io流damo {
    //掌握字节输入流读文件中的字节数组到内存中去的操作
    public static void main(String[] args) throws IOException {
        //1.创建文件字节输入流管道于源文件接通
        InputStream is = new FileInputStream(new File("day03\\src\\liele.txt"));
        InputStream is1 = new FileInputStream("day03\\src\\liele.txt");
        System.out.println(is==is1);
        System.out.println(is.getClass());
//2.读取文件中的字节并输出到控制台     每次读取多个字节的问题:性能较差,读取汉字输出一定会乱码!
        //定义：一个字节数组用于每次读取字节
        byte[] bytes = new byte[3];
        //定义一个变量记住读取的字节个数
 //把读取到的字节数组转换成字符串输出，读取多少倒出多少
        int b;
        while ((b=is.read(bytes))!=-1){
        String ssss = new String(bytes ,0,b);
        System.out.print(ssss);
        }
        //这个还有bug，当里面有一部分不是汉字时，就会有乱码
        //拓展:每次读取多个字节，性能得到提升，因为每次读取多个字节，可以减少硬盘和内存的交互次数，从而提升性能
        ///!依然无法避免读取汉字输出乱码的问题:存在截断汉字字节的可能性!
    }
}
