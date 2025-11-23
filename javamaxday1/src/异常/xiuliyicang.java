package 异常;

import java.util.Scanner;

public class xiuliyicang {
     public static void main(String[] args) {
        //// 目标:掌握异常的处理方案2:捕获异常对象，尝试重新修复、
         //接收用户的一个定价
         System.out.println("程序开始" );

         while (true) {
             try {
                  double aDouble = ssss();
                 System.out.println("用户成功设置了商品价格:"+aDouble);
                 break;
             } catch (Exception e) {
               e.printStackTrace();
               System.out.println("用户重新输入商品价格");
             }
         }

     }
    public static double ssss(){
        Scanner ss  = new Scanner(System.in);
        System.out.println("请输入一个数字");
        double aDouble = ss.nextDouble();
        return aDouble;
    }
}
