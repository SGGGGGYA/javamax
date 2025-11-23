package streamm;

import java.util.Arrays;

public class 可变参数 {
    public static void main(String[] args) {
        //目标：认识可变参数
            sun();//可以不传
            sun( 1);//可以只传一个
            sun(1,2,2,2,3,3,5,4);//可以传很多个
            sun(new int[]{1,21,54,548,45,45});//可以传数组
        //优势：接收参数很灵活，可以代替数组传参
    }

    //注意事项、
    //可变参数在形参列表中只能有一个,可变参数必须在形参列表的最后面
    //    public static void sun( int...ndums, int...ndums)
    //                   可变参数格式   数据类型...加名字

    public static void sun(      int...nums){
        //内部怎么拿数据
        //可变参数对内实际上就是 一个数组。muns就是数组
        System.out.print(nums.length);//有数组的长度
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);  //可以遍历数组
            
        }
         System.out.println(Arrays.toString(nums));//跟数组一样可以返回内容
        System.out.println("=================================");


    }
}
