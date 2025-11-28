package 线程池;



import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class 线程池1 {
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
        // 2、使用线程池处理任务!会不会复用线程?
        Runnable mr = new MyThread2();
//        tpe.execute(new MyThread2());单独用
        tpe.execute(mr);//任务复用  提交第一个任务 创建1线程 自动启动线程 处理这个任务
        tpe.execute(mr);// 提交第2个任务 创建2线程 自动启动线程 (理论上)因为上面的线程有可能跑完了，所以有可能不会创建线程
        tpe.execute(mr);// 提交第3个任务 创建3线程 自动启动线程 (理论上)因为上面的线程有可能跑完了，所以有可能不会创建线程
        tpe.execute(mr);// 提交第3个任务 创建3线程 自动启动线程 (理论上)因为上面的线程有可能跑完了，所以有可能不会创建线程
        tpe.execute(mr);
        tpe.execute(mr);
        tpe.execute(mr);//到了临时线程的创建时机了
        tpe.execute(mr);
        tpe.execute(mr);
        tpe.execute(mr);
        tpe.execute(mr);
        tpe.execute(mr);
        tpe.execute(mr);
        tpe.execute(mr);
        tpe.execute(mr);
        tpe.execute(mr);
        //关闭线程池：一般不关
//        tpe.shutdown();//等所有任务执行完毕后再关闭线程池!
//        tpe.shutdownNow();//不等所有任务执行完毕就关闭线程池!危险！！！
    }


    }

