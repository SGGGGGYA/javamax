package anquan2;

//取钱线程类
public class 纯钱线程 extends  Thread {

    private 存钱账户 ac;//存钱账户对象,记住线程对象要处理的账户对象。
    public 纯钱线程(String name, 存钱账户 ac ) {
        super(name);
        this.ac = ac;


    }
    @Override
    public void run() {
//    取钱
        ac.取钱(100000);
    }
}
