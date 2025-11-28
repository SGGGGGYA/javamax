package 线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class 线程池2 {
    public static void main(String[] args) {
        // 目标:通过线程池工具类:Executors，调用其静态方法直接得到线程
        ExecutorService tpe = Executors.newFixedThreadPool( 3);
//        ExecutorService executorService = Executors.newSingleThreadExecutor();线程池的
        // 2、使用线程池处理Callable任务!
        Future<String> submit = tpe.submit(new MyCallable(10));//提交任务、
        Future<String> submiat = tpe.submit(new MyCallable(100));//提交任务、
        Future<String> submit1 = tpe.submit(new MyCallable(1000));
        Future<String> submit2 = tpe.submit(new MyCallable(1000));
        Future<String> submit3 = tpe.submit(new MyCallable(1000));
        Future<String> submit4 = tpe.submit(new MyCallable(1200));
        try {
            System.out.println(submit.get());
            System.out.println(submiat.get());
            System.out.println(submit1.get());
            System.out.println(submit2.get());
            System.out.println(submit3.get());
            System.out.println(submit4.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
