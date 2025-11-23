package sethashset;

import java.util.*;

public class shshshs {
    public static void main(String[] args) {

//        while (true) {
//            System.out.println("=========欢迎来到学生管理系统=========");
//        }
        String str = "Hello";
        int hash1 = str.hashCode();
        System.out.println("字符串\"Hello\"的哈希码：" + hash1);
        String strs = "Hello";
        int hash11 = strs.hashCode();
        System.out.println("字符串\"Hello\"的哈希码：" + hash11);


        //目标// 目标:认识Set家族集合的特点。
        //创建一个Set集合，特点：不允许重复元素，无序，无索引
     //   Set<String> set = new HashSet<>();//经典代码
      Set<String> set = new LinkedHashSet<>();//特点：有序，不重复，无索引
        set.add("hello");
        set.add("world");
        set.add("鸿蒙");
        set.add("java");
        set.add("c++");
        set.add("元神");
        set.add("性媒体");     
         System.out.println(set);
         //创建一个treeset集合，特点：不允许重复元素，排序（默认从小到大拍升序    ），无索引会把重复的数据去掉
Set<Double> set1 = new TreeSet<>();
 set1.add(1.0);
        set1.add(1.0);
 set1.add(2.0);
 set1.add(3.0);
 set1.add(4.0);
 set1.add(5.1);
 set1.add(5.0);
 System.out.println(set1);

 String s1 = "adc";
 String s2 = "abc";
 System.out.println(s1.hashCode());
 System.out.println(s2.hashCode());

    }

}
