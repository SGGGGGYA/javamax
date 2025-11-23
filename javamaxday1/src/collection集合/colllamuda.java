package collection集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class colllamuda {
    public static void main(String[] args) {
        //// 目标:掌握Collection的遍历方式三：Lambda表达式遍历
        Collection<String> name = new ArrayList<>();

        name.add("小舞");
        name.add("唐三");
        name.add("霍雨浩");
        name.add("戴沐白");
        name.add("李火旺");
// name.forEach(new Consumer<String>() {
//     @Override
//     public void accept(String s) {
//                System.out.println(s);
//     }
// });可以简化
//        name.forEach(s -> System.out.println(s));还可以简化
        name.forEach(System.out::println);

    }
}
