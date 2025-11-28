package io.copy;

import java.io.*;

public class    fuz {
    public static void main(String[] args) throws IOException {
        // 目标:使用字节流完成文件的复制操作。
        // 源文件:E:\resourceljt.jpg
// 目标文件:D:\jt_new.jpg(复制过去的时候必须带文件名的，无法自动生成文件名。)
        copyFile("D:\\接凸凸凸凸凸凸凸\\代码练习.png", "E:\\xiangmu\\javamax\\代码练习.png");

    }
    //复制文件
    public static void copyFile(String srcPath, String destPath) throws IOException {

        //创建一个字节输入流管道与源文件接通
        InputStream is =new FileInputStream(srcPath);
        //创建一个字节输出流管道与目标文件接通
        OutputStream os =new FileOutputStream(destPath);
        //读取一个字节数组，写入一个字节数组
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1) {
            os.write(bytes, 0, len);//读取多少字节就写入多少字节，否则会乱码
        }
        System.out.println("复制完成");
    }
}
