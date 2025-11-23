package collection集合;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class coll {
    public static void main(String[] args) {
        //目标// 目标:搞清楚Collection集合的整体特点.
        //// 1、List家族的集合 ：有序，可重复有索引。
        List<String> list = new ArrayList<>();
list.add("hello");
list.add("world");
list.add("java");
list.add("杨婉敌军");
System.out.println(list);
        var string = list.get(2);
        System.out.println(string);
        //Set 家族的集合：无序，不可重复,无索引。
        Set<String> set = new HashSet<>();
        set.add("红米");
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("kikikik");
        System.out.println(set);
    }
}
