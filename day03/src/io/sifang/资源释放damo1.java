package io.sifang;
import java.io.*;
public class 资源释放damo1 {
        public static void main(String[] args)  {
            // 目标:目标:掌握资源的新方式:try-with-resource
            // 源文件:E:\resourceljt.jpg
// 目标文件:D:\jt_new.jpg(复制过去的时候必须带文件名的，无法自动生成文件名。)
            try {
                copyFile("D:\\接凸凸凸凸凸凸凸\\代码练习.png", "E:\\xiangmu\\javamax\\代码练习.png");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static void copyFile(String srcPath, String destPath) throws IOException {
            try (fuz sos =new fuz();
                    //这里这可以放置资源，但是只能放置一个资源，多个资源只能用try-with-resource
                    InputStream is =new FileInputStream(srcPath);
             OutputStream os =new FileOutputStream(destPath);
                   ){
                byte[] bytes = new byte[1024];
                int len;
                while ((len = is.read(bytes)) != -1) {
                    os.write(bytes, 0, len);//读取多少字节就写入多少字节，否则会乱码
                }
                System.out.println("复制完成");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }

    }}
class fuz implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("自定义");
    }


    //最后一定会执行一次:即便程序出现异常!

//           // 资源释放
//            is.close();           直接这样的话有问题，因为流中间报错的话，后面的资源就不会释放
//            os.close();
}

//担心输入流没有关闭，输出流没有关闭，程序会报错，但是程序会继续执行，但是程序执行完成之后，资源没有释放，就会导致内存泄漏。
//所以，在finally里面，一定要释放资源，无论程序是否报错，程序执行完成，都会执行finally里面的代码。
//但是，如果finally里面有异常，那么finally里面的代码就会抛给调用者，调用者会处理异常。
//但是，如果finally里面没有异常，那么finally里面的代码就会继续执行。
//所以，finally里面一定要释放资源，无论程序是否报错，程序执行完成