package onechen;

public class 线程入门   {
    public static void main(String[] args) {
        //mian方法本身就是一条主线程负责推荐执行
            //目标：认识多线程  ，掌握创建线程的方式之一：继承Thread类来实现
        //4.创建线程类的对象：代表线程，对象调用start()方法启动线程
        Thread t1 = new MyThread();//创建线程对象,多肽。其实这也只是一个Java对象，并不代表真正的线程
        //5.启动线程：调用start()方法启动线程，调用start()方法启动线程，底层会创建线程，并调用run()方法
        t1.start();//启动线程，让线程开始执行run（） 方法

        for (int i = 0; i < 100; i++) {

            System.out.println( "主线程启动了"+ i);
        }
    }
}
 class MyThread extends Thread{
    //定义一个子类继承 Thread类，重写 run()方法，成为一个线程类
//我有一个线程类并不代表在系统中创建了一个线程，而是创建了一个线程对象，对象调用start()方法启动了线程

    @Override
    public void run() {
        // 3、在run方法中编写线程的任务代码（ 线程要干到活）
        for (int i = 0; i < 100; i++) {

            System.out.println( "子线程启动了"+ i);
        }
        System.out.println("线程启动了");
    }
}
