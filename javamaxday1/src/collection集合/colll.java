package collection集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;

public class colll {
    public static void main(String[] args) {
        // 目标:搞清楚Collection提供的通用集合功能。
        Collection<String> c = new ArrayList<>();
        //添加元素
        c.add("唐三");
        c.add("小舞");
        c.add("霍雨浩");
         System.out.println(c);
        //获取集合的元素个数
        System.out.println("此元素个数为"+  c.size());
        //删除集合中的元素
        c.remove("小舞");
        System.out.println("已经删除小舞"+c);
        //判断集合是否为空
        System.out.println("集合是不是空？"+c.isEmpty());

        //判断集合中是否包含某个元素
        System.out.println("集合中是否包含小舞？"+c.contains("小舞"));
        //把集合装换为数组
        Object[] arr = c.toArray();
        System.out.println(Arrays.toString(arr ));
        String[]arr1 =  c.toArray(value -> new String[value]);
        //把集合转换成字符串数组
        String[] arr2 = c.toArray(String[]::new);
        //清空集合
        c.clear();
        System.out.println("集合是不是空？"+c);
    }
}
