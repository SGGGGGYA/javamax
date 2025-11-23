package 异常;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class jil {
    // 目标:掌握异常的处理方案1: 底层异常都抛出去给最外层调用者，最外层捕获异常，记录异常，响应合适信息给用户观看，
     public static void main(String[] args) {
         System.out.println("程序开始");
         try {
             sss();
             System.out.println("走向成功");
         } catch (ParseException e) {
             e.printStackTrace();
             System.out.println("走向失败");
         } catch (Exception e) {
             e.printStackTrace();
             System.out.println("走向失败");
             // 底层异常都抛出去给最外层调用者，最外层捕获异常，记录异常，响应合适信息给用户观看，
         }
         System.out.println("程序结束");
    }
    public static void sss() throws Exception {

        String str="2025-11-15  19:55:21";
//        创建SimpleDateFormat对象
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        java.util.Date date = sdf.parse(str);//报错请您注意!// 编译时异常，提醒程序员这里的程序很容易出错，
        System.out.println(date);

    }
    public static void ssss() throws FileNotFoundException {
        InputStream is=new FileInputStream("d:/a.txt");
    }
    }

