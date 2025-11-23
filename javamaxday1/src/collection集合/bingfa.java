package collection集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class bingfa {

    public static void main(String[] args) {
        //// 认识并发修改异常问题，搞清楚每个遍历的区别
ArrayList<String> list = new ArrayList<>();
list.add("小舞");
list.add("唐三人");
list.add("霍雨浩");
list.add("戴沐白人");
list.add("李火旺人");
list.add("戴拿");
list.add("迪迦");
list.add("胡桃人");
System.out.println(list);
//[小舞,  霍雨浩,  李火旺人, 戴拿, 迪迦, 胡桃人]
// i      i                         i
        //因为集合的遍历是按照索引进行遍历的，所以删除集合中的元素，索引会改变，就会导致遍历的时候，索引越界，就会报ConcurrentModificationException异常
//需求：遍历集合，并删除集合中“人”
        for (int i = 0; i < list.size(); i++) {//索引会改变，出现异常
            String s = list.get(i);
            if (s.contains("人")){
                list.remove(s);
            }
        }System.out.println(list);//没有删除干净这个就是并发修改异常
     System.out.println("================================================11");
        ArrayList<String> list2 = new ArrayList<>();//支持索引
        list2.add("小舞");
        list2.add("唐三人");
        list2.add("霍雨浩");
        list2.add("戴沐白人");
        list2.add("李火旺人");
        list2.add("戴拿");
        list2.add("迪迦");
        list2.add("胡桃人");
        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++){
            String s = list2.get(i);
            if (s.contains("人")){
                list2.remove(i);
                i--;
            }

        }
        System.out.println(list2);
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("小舞");
        list3.add("唐三人");
        list3.add("霍雨浩");
        list3.add("戴沐白人");
        list3.add("李火旺人");
        list3.add("戴拿");
        list3.add("迪迦");
        list3.add("胡桃人");
        System.out.println(list3);
// 需求1:删除全部枸杞
// 解决方案2:倒着遍历并删除(前提是支持索引)
        for (int i = list3.size()-1 ;i>=0;i--){
            String s = list3.get(i);
            if (s.contains("人")){
                list3.remove(i);
            }
        }
  System.out.println(list3);
        // 需求1:删除全部枸杞
// 方案一:迭代器遍历并删除默认也存在并发修改异常问题。
        //可以解决
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("小舞");
        list4.add("唐三人");
        list4.add("霍雨浩");
        list4.add("戴沐白人");
        list4.add("李火旺人");
        list4.add("戴拿");
        list4.add("迪迦");
        list4.add("胡桃人");
        System.out.println(list4);
        var it = list4.iterator();
        while (it.hasNext()){
            String s = it.next();
            if (s.contains("人")){
//                list4.remove(s);这个是自己的删除，会出现并发修改异常
                it.remove();//迭代器的删除，不会出现并发修改异常
            }
        }
        System.out.println(list4);
        System.out.println("==================================================");
        //需求1:删除全部枸杞
//方案二和三:用增强for还有Lambda(都没有办法解决并发修改异常问题)
        //迭代器是隐藏的拿不到所以会报错
        ArrayList<String> list5 = new ArrayList<>();
        list5.add("小舞");
        list5.add("唐三人");
        list5.add("霍雨浩");
        list5.add("戴沐白人");
        list5.add("李火旺人");
        list5.add("戴拿");
        list5.add("迪迦");
        list5.add("胡桃人");
//        System.out.println(list5);
//        for (var string : list5) {
//            if (string.contains("人")){
//                list5.remove(string);
//            }
//        }
        System.out.println(list5);
//        list5.forEach(string -> { if (string.contains("人")){ list5.remove(string);}});
        list5.removeIf(string -> string.contains("人"));

        System.out.println(list5);
    }
}
