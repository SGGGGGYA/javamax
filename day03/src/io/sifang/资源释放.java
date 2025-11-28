package io.sifang;

import java.io.*;

public class 资源释放 {

    public class fuz {
        public static void main(String[] args)  {
            // 目标:使用字节流完成文件的复制操作。
            // 源文件:E:\resourceljt.jpg
// 目标文件:D:\jt_new.jpg(复制过去的时候必须带文件名的，无法自动生成文件名。)
            try {
                copyFile("D:\\接凸凸凸凸凸凸凸\\代码练习.png", "E:\\xiangmu\\javamax\\代码练习.png");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        //复制文件
        public static void copyFile(String srcPath, String destPath) throws IOException {
            InputStream is=null ;
            OutputStream os=null;

            try {
                //创建一个字节输入流管道与源文件接通
                 is =new FileInputStream(srcPath);
                //创建一个字节输出流管道与目标文件接通
                 os =new FileOutputStream(destPath);
                //读取一个字节数组，写入一个字节数组
                byte[] bytes = new byte[1024];
                int len;
                while ((len = is.read(bytes)) != -1) {
                    os.write(bytes, 0, len);//读取多少字节就写入多少字节，否则会乱码
                }
                System.out.println("复制完成");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                //最后一定会执行一次:即便程序出现异常!
                try {
                    if (is != null) {
                        is.close();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    if (os != null) {
                        os.close();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
//           // 资源释放
//            is.close();           直接这样的话有问题，因为流中间报错的话，后面的资源就不会释放
//            os.close();
        }

//担心输入流没有关闭，输出流没有关闭，程序会报错，但是程序会继续执行，但是程序执行完成之后，资源没有释放，就会导致内存泄漏。
        //所以，在finally里面，一定要释放资源，无论程序是否报错，程序执行完成，都会执行finally里面的代码。
        //但是，如果finally里面有异常，那么finally里面的代码就会抛给调用者，调用者会处理异常。
        //但是，如果finally里面没有异常，那么finally里面的代码就会继续执行。
        //所以，finally里面一定要释放资源，无论程序是否报错，程序执行完成
    }

}
