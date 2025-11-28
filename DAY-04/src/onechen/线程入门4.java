package onechen;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class 线程入门4 {
    public static void main(String[] args) throws InterruptedException {
// 日标:掌握多线程的创建方式三:实现Callable接口，方式三的优势:可以获取线程执行完毕后的结果的。
    //3.创建Callable接口的实现类对象
        Callable mc = new MyCallable(10);
        //4.把把Callable对象封装成一个真正的线程任务对象FutureTask对象。
        //
       /* 未来任务对象的作用?
        a、本质是一个Runnable线程任务对象，可以交给Thread线程对象处理。
        b、可以获取线程执行完毕后的结果。*/
        FutureTask<String> ft = new FutureTask<String>(mc);//public FutureTask(Callable<V> callable)
//        Runnable ft = new FutureTask<String>(mc);//多肽
        //5.把FutureTask对象对象作为参数传递给Thread类对象，创建Thread类对象
        Thread t1 = new Thread(ft);
        //6.启动线程
        t1.start();
        Callable mc1 = new MyCallable(102);
        FutureTask<String> ft1 = new FutureTask<String>(mc1);
        Thread t11 = new Thread(ft1);
        t11.start();
        //7.获取线程执行结果
//        try {
//            System.out.println( ft1.get());
//            System.out.println( ft.get());
//                              建议分开try catch 捕获异常       两个进程的异常分开捕获，互不影响
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
        try {
//            如果主线程发现第一个线程还没有执行完毕，会让出CPU，等第一个线程执行完毕后，才会往下执行
            System.out.println( ft1.get());
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        try {
            //如果主线程发现第二个线程还没有执行完毕，会让出CPU，等第一个线程执行完毕后，才会往下执行!
            System.out.println( ft.get());
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
// //1、定义一个实现类实现Callable接口
class MyCallable implements Callable<String> {
private  int n;//线程任务中需要处理的数据
public MyCallable(int n) {//构造方法
    this.n = n;//线程任务中需要处理的数据
}
    //2.实现call方法，定义线程执行体
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i < n; i++) {
//            System.out.println(  "call()方法线程输出" + i);
            sum += i;
        }
        return"计算结果1-" +n+"的和是"+ sum;
    }
}