package xianchenquan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class 存钱账户 {

    private String IardId;
    private double qian;
//取钱模块
    public void 取钱(double qian) {
   //拿到当前谁来取钱。
        String name = Thread.currentThread().getName();
        //判断余额是否充足
        if (this.qian >= qian) {
            System.out.println(name + "取钱成功" + qian +"元成功！！"  );
            this.qian -= qian;
            System.out.println("余额为：" + this.qian);



        }else {
            System.out.println(name + "取钱失败，余额不足！");
        }
    }
}
