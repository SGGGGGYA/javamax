package io.huancong;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class 案例 {
    public static void main(String[] args) {
        //目标:完成出师表的案例。
        // 1、创建一个字符缓冲输入流对象与源文件链接
        try (
                //资源放到try-with-resource中，自动关闭


BufferedReader br =  new BufferedReader(new FileReader("E:\\xiangmu\\javamax\\day03\\src\\io\\huancong\\出师表.txt"));
             //6.创建一个字符缓冲输出流对象与目标文件链接
BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\xiangmu\\javamax\\day03\\src\\io\\huancong\\出师表1.txt"));
        ) {

        //提前准备一个list集合存储数据
            List<String> list = new ArrayList<>();
            //3.按照行读取数据,存入list集合中
            String line;
            while ((line = br.readLine()) != null) {
                //4.给每段集合中的内容，按照首字母升序排序

                list.add(line);
            }
            Collections.sort(list);
            System.out.println(line);
            //遍历集合，将内容写入到目标文件
            for (String s : list){
                bw.write(s);
                bw.newLine();

            }
            System.out.println("完成");


        } catch (Exception e){
            e.printStackTrace();

        }
    }
}
