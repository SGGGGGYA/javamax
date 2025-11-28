package 线程池;

import java.util.concurrent.*;

public class 线程池一 {






        public static void main(String[] args) {
            //目标：创建线程池对象来使用
            //使用线程池的实现类ThreadPoolExecutor声明七个参数来创建线程池对象。
            ThreadPoolExecutor tpe =
                    new ThreadPoolExecutor
                            (3 , 5, 10000,
                                    TimeUnit.SECONDS,
//                                new LinkedBlockingDeque<>(10));//声明一个 基于链表的任务队列
                                    new ArrayBlockingQueue<>(3),//声明一个基于数组的任务队列
                                    Executors.defaultThreadFactory() // 线程工厂
//                                new ThreadFactory() {
//                                    @Override   、、 线程工厂
//                                    public Thread newThread(Runnable r) {
//                                        return  new Thread(r);
//                                    }
                                    ,new ThreadPoolExecutor.AbortPolicy()  // 拒绝策略,忙不过来就抛异常
                                    // new ThreadPoolExecutor.DiscardOldestPolicy()  // 拒绝策略,忙不过来就抛弃最老的
                                    // new ThreadPoolExecutor.DiscardPolicy()  // 拒绝策略,忙不过来就抛弃
//                                 ,new ThreadPoolExecutor.CallerRunsPolicy()  // 拒绝策略,忙不过来让老板来执行这个任务
//                                }


                            );
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



