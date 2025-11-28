package io.huancong;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class 字符缓冲输出流 {
        public static void main(String[] args) {
            //目标：目标:搞清楚缓冲字符输出流  的使用:提升了字符输出流的写字符的性能，
            //，多了换行功能
            //创建一个字符输出流对象，将数据写入到文件中。
            try(
                    Writer fw = new FileWriter("E:\\xiangmu\\javamax\\day03\\src\\liele.txt");//覆盖管道，会把旧文件覆盖，丢内容
                    FileWriter fw1 = new FileWriter("E:\\xiangmu\\javamax\\day03\\src\\liele.txt",true);//追加管道，不会覆盖，会追加
                    //2.创建一个缓冲字符输出流对象，把字符输出流对象作为构造参数传递给缓冲字符输出流对象。、

                    //低级管道决定特性，高级管道决定性能
                    BufferedWriter bw = new BufferedWriter(fw);


            ) {
                bw.write(94);
                bw.write("h");
                bw.write("类");
                //换行
                bw.newLine();//注意：这里不可以用多肽，否则会报错，因为父类方法里面没有换行方法，所以只能用子类方法
                fw1.write("hello world");
                bw.write("hello world");
                bw.write("hello world");
                //3.写一个字符串
                bw.write("hello world");
                //3.写字符串的一部分出去
                bw.write("hello world", 0,2);
                //写一个字符数组出去   public void write(char[] cbuf) throws IOException
                char[] chars = "hello world".toCharArray();//转换成字符数组
                bw.write("4546".toCharArray());//转换成字符数组
                //4.写字符数组的一部分出去  public void write(char[] cbuf, int off, int len) throws IOException
                bw.write(chars, 0, chars.length);//写一个字符数组的一部分出去
                bw.write("hello world".toCharArray(), 0, "hello world".length());
                //刷新缓冲区，将缓冲区中的数据写出去，并清空缓冲区
//            fw.flush();
                //刷新后，流可以继续使用，不会被关闭
//            fw.close();//关闭流    关闭资源，关闭包含了刷新!关闭后流不能继续使用!

                //自从 jdk7以后自动关闭流，不用自己关闭了，同时自动刷新


            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


