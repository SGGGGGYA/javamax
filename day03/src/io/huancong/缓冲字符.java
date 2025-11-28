package io.huancong;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class 缓冲字符 {
    public static void main(String[] args) throws Exception {
        // 目标:搞清楚缓冲字符输入流读取字符内容:性能提升了，多了按照行读取文本的能力。
                //1.创建一个字符输入流对象，将文件资源关联到输入流对象中。
                try (Reader fr = new FileReader("E:\\xiangmu\\javamax\\day03\\dilei01.sss");
                     //2.创建缓冲输入流对象，将字符输入流对象，关联到缓冲输入流对象中。
                     BufferedReader br = new BufferedReader(fr)) {
//                    //2.创建一个字符数组，用于装读取的字符数据。
//                    char[] chars = new char[1024];
//                    //3.调用read方法，将数据读取到数组中。
//                    int len;
//                    while ((len = br.read(chars)) != -1) {
//                        //4.将字符数组转换成字符串，并打印。
//                        System.out.print(new String(chars, 0, len));
//                    String string = br.readLine();
//                    System.out.println(string);               不靠谱
                    //用循环改进，来读取数据
                    //定义一个字符串变量用于记住每次读取的一行数据
                    String string;
                    while ((string = br.readLine()) != null) {
                        System.out.println(string);
                    }
                    //目前读取文本最优雅的方案:性能好，不乱码，可以按照行读取。
                }
                    //这个方式好不好
                    //// 拓展:文件字符输入流每次读取多个字符，性能较好，而且读取中文
                    // 是按照字符读取，不会出现乱码!这是一种读取中文很好的方案。
//                    String string = br.readLine();//这个不靠谱
//                    System.out.println(string);
//                    //

                catch (Exception e) {
                    e.printStackTrace();
                }


            }


        }
