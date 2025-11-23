package collection集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class collbianli {
    public static void main(String[] args) {
        //// 目标:掌握Collection的遍历方式一:选代器遍历
        Collection<String> name = new ArrayList<>();

        name.add("小舞");
        name.add("唐三");
        name.add("霍雨浩");
        name.add("戴沐白");
        name.add("李火旺");
        System.out.println(name);//[小舞, 唐三, 霍雨浩, 戴沐白, 李火旺]
        //                          it
        //得到这个集合的迭代器对象
        var it = name.iterator();
//        System.out.println(it.next());//移到下一位
//         System.out.println(it.next());
//         System.out.println(it.next());
//         System.out.println(it.next());
//         System.out.println(it.next());
         //使用一个while循环遍历
        while(it.hasNext()){//当前有没有数据 
            String s = it.next();
//            String s1 = it.next();
//            String s2 = it.next();
//            String s3 = it.next();
            //如果是最后一个数据，就会报NoSuchElementException异常，所以不可以再调用next()方法
//            String s4 = it.next();
//            System.out.println(s );
//            System.out.println(s1);
//            System.out.println(s2);
//            System.out.println(s3);
            //应该是问一次取一次，用while循环，循环条件是it.hasNext()然后把数据交给一个变量变量没有影响
            System.out.println(s);


        }
    }
}
