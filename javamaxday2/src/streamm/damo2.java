package streamm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class damo2 {
    // 目标:获取Stream流的方式。
    // 1、获取集合的stream流:调用集合提供的stream()方法
    public static void main(String[] args) {
        //所有单例集合获取stream流都要调用stream()方法
        ArrayList<String> list = new ArrayList<>();
        var s1   = list.stream();
        //如果是map呢
        //var s2 = map.stream();
        Map<String, String> map = new HashMap<>();

        //获取键流
        map.keySet();//获取所有的键的集合
        var s41 = map.keySet().stream();//获取键的stream流
//        map.stream();   报错1、
        var s2 = map.entrySet().stream();//获取键值对的集合

    }
}
