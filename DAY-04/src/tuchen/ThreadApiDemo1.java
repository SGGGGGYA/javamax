package tuchen;



public class  ThreadApiDemo1{
    public static void main(String[] args) {
        //目标：掌握多线程的启动方式搞清楚线程的常用方法
        //线程取名字的注意事项:要在start()方法之前调用不然就用不了了
        Thread t1 = new MyThread1("香香的一号猫娘");
//        t1.setName("香香的一号猫娘");
        t1.start();
        System.out.println(t1.getName());// 线程默认名称是:Thread-索引
        Thread t2 = new MyThread1("香香的二号猫娘");
//        t2.setName("香香的二号猫娘");
        t2  .start();
        System.out.println(t2.getName());// 线程默认名称是:Thread-索引
        //哪个线程调用这个代码，这个代码就拿到哪个线程
        Thread thread = Thread.currentThread();//主线程
        thread.setName("主人");
        System.out.println(thread.getName());//主线程的名称是:main\
        // Runnable mr = new MyRunnable();
////        Thread t1 = new Thread(mr, "线程1");//pubilc Thread(Runnable target, String name)
//        t1.start();

    }
}
class  MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);//  public Thread(String name)
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName()+ "子线程启动了"+ i);
        }
        System.out.println("线程启动了");
    }
}
