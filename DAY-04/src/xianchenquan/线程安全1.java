package xianchenquan;

public class 线程安全1 {
    public static void main(String[] args) {
//// 目标:模拟线程安全问题。
//// 1、设计一个账户类:用于创建小明和小红的共同账户对象，存入10万。
        存钱账户 ac = new 存钱账户("小明的ICBE-001", 100000);
        // 2、设计线程类，创建两个线程，模拟小明和小红同时取款，模拟小明和小红同时取款10万元。
        new 纯钱线程( "小红" , ac).start();
        new 纯钱线程( "小明", ac ).start();

    }
}
