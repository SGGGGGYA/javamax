package io.fai;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class zijie {
    public static void main(String[] args) throws Exception {
        // 目标:学会使用文件字节输出流。
        //  1、创建文件字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("day03\\src\\liele.txt");//覆盖管道
        OutputStream os1 = new FileOutputStream("day03\\src\\liele.txt",true);//追加管道
        // 2、写出数据
        os.write(97);//写一个字节
        os.write('b');
        os.write("\r\n".getBytes());
        //3.写一个字节数组
        os.write("我".getBytes());
        byte[] bytes = "我要玩原神".getBytes();
        os.write(bytes);
        //4.写一个字节数组的 部分
        os.write(bytes, 0, bytes.length);
        os.write(bytes, 0, 3);
        //5.结束，
        os.close();     
    }
}
