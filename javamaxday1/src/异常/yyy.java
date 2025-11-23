package 异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;

public class yyy {
    public   static void main(String[] args) {
// 目标:认识异常的体系，搞清楚异常的基本作用。\
//        ssss();
        try {
            sss();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    //定义一个方法认识编译式异常
    //编译时异常，编译阶段检查，如果代码有异常，就会报错，不能通过编译。
    public static void sss() throws ParseException {




        System.out.println("程序开始");
        String str="2025-11-15  19:55:21";
//        创建SimpleDateFormat对象
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            var date = sdf.parse(str);//报错请您注意!// 编译时异常，提醒程序员这里的程序很容易出错，
                System.out.println(date);
                System.out.println("程序结束"   );
            }
            public static void ssss() throws FileNotFoundException {
                InputStream is=new FileInputStream("d:/a.txt");
            }
//    public static void ssss(){
//        System.out.println("程序开始");
////        System.out.println(10/0);//java.lang.ArithmeticException: / by zero
////        int[]arr={1,2,3};
//        //空指针异常
//        String str=null;
//        System.out.println(str);
//        System.out.println(str.length() );//java.lang.NullPointerException//不知道1有多长1
//
//
//
////        System.out.println(arr[3]);//.ArrayIndexOutOfBoundsException
//        System.out.println("程序结束");
//
//        // 运行时异常的特点:编译阶段不报错，运行时出现的异常，继承自RuntimeException。
//    }
}
