package 异常;

public class zdys {
    public static void main(String[] args) {
System.out.println("开始执行");
        try {
            mmmm(0);
            System.out.println("走向成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //需求我们公司的系统只要收到了年龄小于1岁或者大于200岁就是一个年龄异常
    public static   void   mmmm(int age) {//默认抛出异常对象
        if(age<1||age>200){
            //创建一个异常对象//抛出异常对象
            throw new idhemssa("年龄异常");
        }else {
            System.out.println("年龄正常");
        }
    }
}
