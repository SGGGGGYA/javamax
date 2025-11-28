package 线程池;

public   class  MyThread2 extends Thread{


    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
             System.out.println(Thread.currentThread().getName()+ "喵喵线程"+ i);
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("线程启动了");
    }
}