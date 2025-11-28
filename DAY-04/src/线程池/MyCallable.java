package 线程池;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
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
        return Thread.currentThread().getName()+"喵喵计算结果1-" +n+"的和是"+ sum;
    }
}