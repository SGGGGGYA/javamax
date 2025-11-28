package io.zifu;

import java.io.FileWriter;

public class 字符输出流 {
    public static void main(String[] args) {
        //目标：掌握字符输出流的使用
        //创建一个字符输出流对象，将数据写入到文件中。
        try(
                FileWriter fw = new FileWriter("E:\\xiangmu\\javamax\\day03\\src\\liele.txt");//覆盖管道，会把旧文件覆盖，丢内容
                FileWriter fw1 = new FileWriter("E:\\xiangmu\\javamax\\day03\\src\\liele.txt",true);//追加管道，不会覆盖，会追加
                ) {
fw.write(94);
fw.write("h");
fw.write("类");
            fw1.write("hello world");
            fw.write("hello world");
            fw.write("hello world");
                //3.写一个字符串
            fw.write("hello world");
            //3.写字符串的一部分出去
            fw.write("hello world", 0,2);
            //写一个字符数组出去   public void write(char[] cbuf) throws IOException
            char[] chars = "hello world".toCharArray();//转换成字符数组
            fw.write("4546".toCharArray());//转换成字符数组
            //4.写字符数组的一部分出去  public void write(char[] cbuf, int off, int len) throws IOException
            fw.write(chars, 0, chars.length);//写一个字符数组的一部分出去
            fw.write("hello world".toCharArray(), 0, "hello world".length());
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
