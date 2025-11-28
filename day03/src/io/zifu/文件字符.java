package io.zifu;

import java.io.FileReader;
import java.io.IOException;

public class 文件字符 {
    public static void main(String[] args) {

        //// 目标:掌握文件字符输入流读取字符内容到程序中来。
        //1.创建一个字符输入流对象，将文件资源关联到输入流对象中。
        try (FileReader fr = new FileReader("E:\\xiangmu\\javamax\\day03\\dilei.sss")) {
            //2.创建一个字符数组，用于装读取的字符数据。
            char[] chars = new char[1024];
            //3.调用read方法，将数据读取到数组中。
            int len;
            while ((len = fr.read(chars)) != -1) {
                //4.将字符数组转换成字符串，并打印。
                System.out.print(new String(chars, 0, len));
            }
            //这个方式好不好
            //// 拓展:文件字符输入流每次读取多个字符，性能较好，而且读取中文
            // 是按照字符读取，不会出现乱码!这是一种读取中文很好的方案。
        } catch (IOException e) {

        }


    }


}

