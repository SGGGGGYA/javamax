package sethashset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class chesilei {
//    public static void main(String[] args) {
//// 目标:搞清楚TreeSet集合对于自定义对象的排序
//        Set<laosi> set = new TreeSet<>(new Comparator<laosi>() {
//            @Override//就近原则
//            public int compare(laosi o1, laosi o2) {
////                return Double.compare(o1.getSalary(), o2.getSalary());升序
////                return Double.compare(o2.getSalary(), o1.getSalary());//降序
//
//
//// 降序                   return o1.getAge() - o2.getAge() ;
////if (o1.getSalary() > o2.getSalary()){
////    return 1;
////}else if (o1.getSalary() < o2.getSalary()){
////    return -1;
////}else {
////    return 0;
//////}
////      升序          if (o1.getSalary() < o2.getSalary()){
////                    return 1;
////                } else if (o1.getSalary() > o2.getSalary()){
////                    return -1;
////                } else {
////                    return 0;
////                }
//            }
//        });//排序，无重复，无索引
        public static void main(String[] args) {
// 目标:搞清楚TreeSet集合对于自定义对象的排序
            Set<laosi> set = new TreeSet<>( (o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()));//排序，无重复，无索引
        set.add(new laosi("小王", 18, 5000));
        set.add(new laosi("kiki", 8, 400));
        set.add(new laosi("小舞", 8, 55000));
        set.add(new laosi("赵敏", 18, 4000));
        set.add(new laosi("小丑", 48, 500));
        System.out.println(set);
        // 结论:TreeSet集合默认不能给自定义对象排序啊，因为不知道大小规则。
        // 一定要能解决怎么办?两种方案
//结论：TreeSet集合要求集合中的元素必须实现Comparable接口，并且重写compareTo方法，按照升序排序
        //2. public TreeSet （Comparator c）集合自带比较器Comparator比较器，指定升序规则

    }
}
