package 泛型;

import java.util.ArrayList;
import java.util.Objects;

public class fflll {
    public static void main(String[] args) {
        // 泛型方法
        // 目标:认识泛型，搞清楚使用泛型的好处。
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hello");
        ArrayList       list1 = new ArrayList<>();
        list1.add("hello");
        list1.add(false);
        list1.add(1234);
   for (int i=0;i<list.size();i++){
       String s = list.get(i);
       System.out.println(s);
   }
   for (int i=0;i<list1.size();i++){
       Object o = list1.get(i);
       System.out.println(o);
   }

    }
}
