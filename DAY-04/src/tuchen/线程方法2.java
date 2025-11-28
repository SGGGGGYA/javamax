package tuchen;

public class 线程方法2 {
    public static void main(String[] args) {
        //目标：搞清楚Thread类的Sleep方法(线程休眠)
        for (int i = 0; i < 10; i++) {
            System.out.println("线程1输出" + i);
            try {
                Thread.sleep(1000);
                //当前执行的线程进入休眠状态，直到时间到了，才会继续执行，
                //项目经理让我加上这行代码，如果用户交钱了，我就注释掉。
                System.out.println("线程1休眠了1秒")  ;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
