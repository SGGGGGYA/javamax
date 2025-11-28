package onechen;

public class 线程入门3 {
    //// 目标:掌握多线程的创建方式二:实现Runnable接口的匿名内部类来创建
    public static void main(String[] args) {
        //3.创建Runnable接口的实现类
        //创建线程任务类的对象代表一个线程任务。
        Runnable mr = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(  "子线程输出" + i);
                }
            }
        };
        //4.创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        //把线程任务对象交给一个线程对象来处理
        Thread t1 = new Thread(mr);//pubilc Thread(Runnable target)
        //启动线程

        t1.start();
        Runnable mr1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(  "子线程输出" + i);
                }
            }
        };
        //4.创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        //把线程任务对象交给一个线程对象来处理
        Thread t11 = new Thread( new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(  "子1线程输出" + i);
                }
            }
        });//pubilc Thread(Runnable target)
        //启动线程


        t11.start();
        new Thread( new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(  "子1w线程输出" + i);
                }
            }
        }).start();
        new Thread( ()-> {
                for (int i = 0; i < 10; i++) {
                    System.out.println(  "子1w线程输出" + i);
                }
        }).start();

        for (int i = 0; i < 10; i++) {
            System.out.println(  "主     线程输出" + i);
        }

    }
}
