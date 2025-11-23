package streamm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class damo
{
    public static void main(String[] args) {
        //目标:掌握Stream流使用 ，掌握其基本使用步骤，体会它的优势和特点
        List<String>  jihe=new ArrayList<>();
        jihe.add("hello");
        jihe.add("world");
        jihe.add("java");
        jihe.add("pc++");
        jihe.add("pyth");
        //用传统的方式：找出带p的字符串，字符个数为4个的字符串，存到新集合中去
        List<String> list = new ArrayList<>();//新集合
        for (String s : jihe) {//遍历集合
            if (s.startsWith("p") && s.length() == 4) {//判断
                list.add(s);//添加
             }
        }
        System.out.println(list);


        System.out.println("===========================");
        //用Stream流来解决
        jihe.stream()
                .filter(s -> s.startsWith("p"))//筛选filter：过滤
                .filter(s -> s.length() == 4)
                .forEach(System.out::println);
        System.out.println("===========================");
        List<String> list1 = jihe.stream()
                .filter(s -> s.startsWith("p")&&  s.length() == 4   )//筛选filter：过滤//天才@！！！！！可以用&&
//                .filter(s -> s.length() == 4)
                .collect(Collectors.toList());
        System.out.println(list1);


    }

}
