package collection集合.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lest {
    public static void main(String[] args) {
//目标:掌握List集合系列的独有功能
        List<String> list = new ArrayList<>();//一行经典代码 多态
        //添加数据

        list.add("小舞");
        list.add("唐三");
        list.add("元素");
        list.add("gay");
        System.out.println(list);//[小舞, 唐三, 元素, gay]
        //插入数据（赵敏）
        list.add(2,"赵敏");
        System.out.println(list);//[小舞, 唐三, 赵敏, 元素, gay]
        //删除数据
        System.out.println(list.remove(2));
        System.out.println(list);
//修改数据
        System.out.println("=================");
        System.out.println(list.set(1, "小舞"));
        System.out.println(list);
        //  根据索引获取元素
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println("======================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }//获取集合的长度
        // 迭代器
        var it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//增强for
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("===========================");
        //Lambda
        list.forEach( System.out::println);
    }
}
