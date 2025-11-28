package onechen;

import java.io.Closeable;
import java.io.IOException;

public class 线程入门2 {
    public static void main(String[] args) {
        //// 目标:掌握多线程的创建方式二:实现Runnable接口来创建
        //3.创建Runnable接口的实现类
        //创建线程任务类的对象代表一个线程任务。
            Runnable mr = new MyRunnable();
        //4.创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        //把线程任务对象交给一个线程对象来处理
        Thread t1 = new Thread(mr, "线程1");//pubilc Thread(Runnable target)
//        Runnable mr = new MyRunnable();
////        Thread t1 = new Thread(mr, "线程1");//pubilc Thread(Runnable target, String name)
//        t1.start();
        //启动线程
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(  "主     线程输出" + i);
        }
    }
}
//1、定义一个线程任务类实现Runnable接口

//不影响继承其他 类
 class MyRunnable implements Runnable, Closeable {
    // 重写线程任务类中的run方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(  "子线程输出" + i);
        }
    }

    @Override
    public void close() throws IOException {

    }
}
