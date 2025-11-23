package streamm;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class damo4 {
    public static void main(String[] args) {
        //目标// 目标:掌握Stream流的统计，收集作(终结方法)
        List<老师> list = new ArrayList<>();
        list.add(new 老师(  "小王", 18, 100));
        list.add(new 老师(   "小王", 18, 1001));
        list.add(new 老师("小咯", 18, 100));
        list.add(new 老师("小我", 18, 100));
        list.add(new 老师("xiaow",45,454   ));
        list.add(new 老师("xiaow", 45, 454));
        list.add(new 老师("laozhang", 38, 520));
        list.add(new 老师("wangshi", 42, 480));
        list.add(new 老师("lisense", 35, 420));
        list.add(new 老师("zhaojiao", 50, 600));
        list.stream().filter(t -> t.getAge() > 40).forEach(System.out::println);
System.out.println("===========================");
        var collect = list.stream().filter(t -> t.getSalary() > 500).collect( Collectors.toList());
        System.out.println(collect);
        System.out.println("===========================");
        //获取最高工资
        var max = list.stream().max((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        //获取Optional对象的元素
       老师   laozhang = max.get();
        System.out.println(max);
        System.out.println("===========================");
        //获取最低工资
        var min = list.stream().min((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        老师   laozhang1 = min.get();
        System.out.println(min);
        System.out.println("===========================");
        //收集统计
        System.out.println("================");
        List<老师> list1 = new ArrayList<>();
        list1.add(new 老师(  "小王", 18, 100));
        list1.add(new 老师(   "小王", 18, 1001));
        list1.add(new 老师("小咯", 18, 100));
        list1.add(new 老师("小我", 18, 100));
        list1.add(new 老师("xiaow",45,454   ));
        list1.add(new 老师("xiaow", 45, 454));
        list1.add(new 老师("laozhang", 38, 520));
        list1.add(new 老师("wangshi", 42, 480));
        list1.add(new 老师("lisense", 35, 420));
        list1.add(new 老师("zhaojiao", 50, 600));
        //收集到集合或数组中去
        Stream<老师> xiaow = list1.stream().filter(s -> s.getName().startsWith("xiaow"));
        System.out.println(xiaow);

        //收集到List集合中

        List<老师> collect1 = xiaow.collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("================");
        //搜集到set中、

        Set<老师> collect2 = list1.stream()
                .filter(s -> s.getName().startsWith("xiaow"))
                .collect(Collectors.toSet());
        System.out.println(collect2);
//        var collect2 = xiaow.collect(Collectors.toSet());
//        System.out.println(collect2);
//流在上面已经被用完了 ，不能再次使
      //流只能 被收集一次
        System.out.println("================");
        //如果开发的时候要多次用流怎么办
        //用一个set集合来保存List集合,就是左手倒右手
        Set<String> set = new LinkedHashSet<>();//特点：有序，不重复，无索引
        set.add("hello");
        set.add("world");
        set.add("鸿蒙");
        set.add("java");
        set.add("c++");
        set.add("元神");
        set.add("性媒体");
        System.out.println(set);
        Set<String> objects = new HashSet<String>();
        objects.addAll(set);
        objects.stream().filter(s -> s.startsWith("xiaow")).forEach(System.out::println);
        //数据要传给数组怎么办
        var xiaow1 = list1.stream().filter(s -> s.getName().startsWith("xiaow"));
        Objects[] objects1 = (Objects[]) xiaow1.toArray();
         System.out.println(Arrays.toString(objects1));
    }
}
