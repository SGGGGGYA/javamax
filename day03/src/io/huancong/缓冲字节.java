package io.huancong;

import java.io.*;

public class 缓冲字节 {

        public static void main(String[] args)  {
            // // 目标:使用掌握缓冲字节流的使用的方法
            // 源文件:E:\resourceljt.jpg
// 目标文件:D:\jt_new.jpg(复制过去的时候必须带文件名的，无法自动生成文件名。)
            try {
                copyFile("D:\\接凸凸凸凸凸凸凸\\代码练习.png", "E:\\xiangmu\\javamax\\代码练习.png");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static void copyFile(String srcPath, String destPath) throws IOException {
            try (fuz1 sos =new fuz1();
                 //这里这可以放置资源，但是只能放置一个资源，多个资源只能用try-with-resource
                 InputStream is =new FileInputStream(srcPath);
                 //把低级的字节流升级为高级的缓冲字节流
                  BufferedInputStream bis =new BufferedInputStream(is);
                 OutputStream os =new FileOutputStream(destPath);
                 //把低级的字节输出流升级为高级的缓冲字节输出流
                  BufferedOutputStream bos =new BufferedOutputStream(os);
            ){
                byte[] bytes = new byte[1024];
                int len;
                while ((len = bis.read(bytes)) != -1) {
                    bos.write(bytes, 0, len);//读取多少字节就写入多少字节，否则会乱码
                }
                System.out.println("复制完成");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }

        }}
    class fuz1 implements Closeable {
        @Override
        public void close() throws IOException {
            System.out.println("自定义");
        }}
