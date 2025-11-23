package 异常;

public class eeee {
     public static void main(String[] args) {
         // 目标:搞清楚异常的作用。
         System.out.println("开始执行");
try {
    System.out.println(getShu(10,0));
    System.out.println("走向成功  ");
} catch (Exception e) {
    e.printStackTrace();
    System.out.println("低沉方法失败 ");
}
         System.out.println("结束执行");
    }
    //求数的商
    public static int getShu(int a,int b){
         if (b==0){
             System.out.println("除数不能为0");
//             return -1;//代表错误
             ////可以返回一个异常给上层调用者，返回的异常还能告知上层底层是执行成功了还是执行失败了!!
         throw new RuntimeException("除数不能为0");
         }
         return a/b;
    }
}
