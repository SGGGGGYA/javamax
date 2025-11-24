package file.damobianma;

import java.util.Arrays;

public class 编码 {
    public static void main(String[] args) throws  Exception {
        //目标：写程序实现字符码编码和解码
        //1.编码
        String s = "我要玩原神";
        byte[] bytes = s.getBytes();//字符串转换成字节数组  平台的UFT-8编码
        System.out.println(bytes.length);
        System.out.println(     Arrays.toString(bytes));
        byte[] bytesa = s.getBytes( "GBK");//字符串转换成字节数组  GBK编码
        System.out.println(bytesa.length);
        System.out.println(     Arrays.toString(bytesa));
        //2.解码
        String s1 = new String(bytes);//字节数组转换成字符串  平台默认UTF-8
        System.out.println(s1);
        String s2 = new String(bytesa, "GBK");//字节数组转换成字符串  GBK
        System.out.println(s2);
    }

}
//目标：
/**
 * 编码：将字符串转换成字节数组
 * 1.String类中的方法：
 *      byte[] getBytes()
 *      参数：无
 *      返回值：字节数组
 *      作用：将字符串转换成字节数组
 * 2.字节数组转换成字符串
 *      String(byte[] bytes)
 *      参数：字节数组
 *      返回值：字符串
 *      作用：将字节数组转换成字符串
 **/