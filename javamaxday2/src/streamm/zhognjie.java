package streamm;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class zhognjie{
    public static void main(String[] args) {
        // 目标:掌握Stream流的统计，收集作(终结方法)
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher( "张二",50,2300));
        teachers.add( new Teacher( "钟离", 60,5000));
        teachers.add( new Teacher("金毛狮王", 54,16000));
    teachers.add(new Teacher( "李",24,6000));
    teachers.add(new Teacher( "王五", 25,7000));
    teachers.add(new Teacher(  "白眉鹰王", 66,108000));
    teachers.add(new Teacher( "陈昆",48000, 42));
    teachers.stream()
            .filter( t->t.getSalary()>=100000 )
            .forEach(System.out::println);//终结方法
        System.out.println("==========分割线=========");
        long count = teachers.stream()
                .filter(t -> t.getSalary() >= 100000).count();
        System.out.println( "工资大于十万的人有"+count+"个");
        System.out.println("==========分割线=========");
        //max
        Optional<Teacher> max = teachers.stream().max(((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())));
        Teacher maxTeacher = max.get();//调用get方法获取Optinoal中的元素
        System.out.println( maxTeacher);
        System.out.println("==========分割线=========");
        Optional<Teacher> min = teachers.stream().min(((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())));
        Teacher minTeacher = min.get();
        System.out.println( minTeacher);
        System.out.println("==========分割线=========");
        //流只能被收集一次
        List<String> list =new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");
        list.add("张翠山");
        //收集到集合或数组中去
        Stream<String> 张 = list.stream().filter(s -> s.startsWith("张"));
        //收集到List集合中去
        List<String> collect = 张.collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("==========分割线=========");
        //收集到set集合中去
        //引用上文的lest集合
//        HashSet hashSet = new HashSet<>();
//        hashSet.addAll(collect );

        Stream<String> 张1 = list.stream().filter(s -> s.startsWith("张"));
        Set<String> collect1 = 张1.collect(Collectors.toSet());
        System.out.println(collect1);




        System.out.println("==========分割线=========");
        //收集到数组中去
        Stream<String> 张2 = list.stream().filter(s -> s.startsWith("张"));
        Object[] array = 张2.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("==========分割线=========");
         //搜集到map集合中去，键是老师名称，值是老师薪水
                                                        //升序
//        Stream<Teacher> sorted = teachers.stream().sorted((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
//                           map是无序的，会把顺序打乱所以没有必要进行排序
//        Map<Integer, String> collect2 = teachers.stream().collect(Collectors.toMap(Teacher::getAge, Teacher::getName));
        //                              直接得到stream流
         Map< String ,Double> collect2 = teachers.stream().collect(Collectors.toMap(
                 new Function<Teacher, String>() {
                     @Override
                     public String apply(Teacher teacher) {
//                         return "";意思是返回什么做为键
                         return teacher.getName();
                     }
                 }, new Function<Teacher, Double>() {
                     @Override
                     public Double apply(Teacher teacher) {
//                         return 0.0;意思是返回什么作为值
                         return teacher.getSalary();
                     }
                 }
                 //两个参数

         ));

         //二号版本，=还可以简化就是了
        Map< String ,Double> collect3 = teachers.stream()
                .collect(Collectors.toMap
                        //            调用getname方法           调用
                        (   t->t.getName(),t-> t.getSalary()));
        //原理是一样的
        //三号版本
        Map< String ,Double> collect4 = teachers.stream()
                .collect(Collectors.toMap
                        //          特殊类型调用可以用类名两个冒号：：然后用他的get方法
                                //方法引用的简化形式
                                ( Teacher::getName,Teacher::getSalary                    ));

        System.out.println(collect2);
        System.out.println(collect3);
        System.out.println(collect4);
    }
}
