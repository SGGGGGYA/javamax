package streamm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class damo3 {
    public static void main(String[] args) {
        // 目标:掌握Stream提供的常用的中间方法，对流上的数据进行处理(返回新流:支持链式编程)
         List<  String>    objects = new ArrayList<String>  ();
        objects.add(" 张 三 ");
        objects.add("历史 ");
        objects.add("我爱玩呀");
        objects.add("沿途盎司  ");
        objects.add("哈基米");
        objects.add("我鱼鱼鱼");

        //过滤方法
         objects.stream().
                 filter(s -> s.startsWith("我")&&s.length()==4)//因为String类有startsWith方法Object类没有
                 .forEach(new Consumer<String>() {//结束方法
                     @Override
                     public void accept(String s) {
                          System.out.println(s);
                     }
                 });
////                 .forEach(System.out::println);
//                 .forEach(s -> System.out.println(s));
        //排序方法
        var arrayList = new ArrayList<Double>();
        arrayList.add(10.0);
        arrayList.add(9.0);
        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(2.1);
        arrayList.add(3.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);
        arrayList.stream().sorted().forEach(System.out::println);//默认是升序
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        arrayList.stream().sorted
                        ((o1,o2)->Double.compare( o2,o1))//降序
                .forEach(System.out::println);//降序
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        arrayList.stream().sorted
                        ((o1,o2)->Double.compare( o2,o1))//降序
                .limit(3)
                .forEach(System.out::println);//降序
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        arrayList.stream().sorted
                        ((o1,o2)->Double.compare( o2,o1))//降序
                .skip(3) // 跳过前3个元素
                .forEach(System.out::println);//降序
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        //如果希望自定义对象能够去重复，重写对象的hashcode和equals方法，才可以去重复!
        arrayList.stream().sorted
                        ((o1,o2)->Double.compare( o2,o1))//降序
                .distinct()
                .forEach(System.out::println);//降序
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        //加工方法；映射方法：将流中的元素进行映射，得到新的元素
        arrayList.stream().map(s ->"翻倍后" +s*2)
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        //合并流
        Stream<String> stream1 = Stream.of("张三","元","张三封","sss三","少时诵诗书2张三");
        Stream<Integer> s1   = Stream.of(1,2,35,557,410);
        var concatx = Stream.concat(stream1, s1);
        concatx.forEach(System.out::println);
    }
    }
