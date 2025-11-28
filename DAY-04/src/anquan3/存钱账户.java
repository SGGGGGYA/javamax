package anquan3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class 存钱账户 {

    private String IardId;
    private double qian;
      private  final Lock lock = new ReentrantLock();//不可以用静态的,不可更改
//取钱模块
    public  void 取钱(double qian) {
   //拿到当前谁来取钱。
        String name = Thread.currentThread().getName();
        lock.lock();//上锁
        //判断余额是否充足
        try {
            if (this.qian >= qian) {
                System.out.println(name + "取钱成功" + qian +"元成功！！"  );
                this.qian -= qian;
                System.out.println("余额为：" + this.qian);



            }else {
                System.out.println(name + "取钱失败，余额不足！");
            }
        } finally {
            lock.unlock();//解锁
            
        }
    }
}
