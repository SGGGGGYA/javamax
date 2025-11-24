package io.fai;

import java.io.*;

public class aaaa {
    //掌握字节输入流读文件中的字节数组到内存中去的操作
    public static void main(String[] args) throws IOException {
        //1.创建文件字节输入流管道于源文件接通
        InputStream is = new FileInputStream(new File("day03\\src\\liele.txt"));
        //2.一次性读完全部字节：可以避免读取汉字输出乱码的问题
        //如果文件过大，则使用这个方法会抛出OutOfMemoryError异常
        byte[] bytes = is.readAllBytes();
        String ssss = new String(bytes);
        System.out.println(ssss);
    }
}
