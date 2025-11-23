package collection集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class forxunhuan {
    public static void main(String[] args) {
        //// 目标:掌握Collection的遍历方式二:增强for循环遍历
        Collection<String> name = new ArrayList<>();

        name.add("小舞");
        name.add("唐三");
        name.add("霍雨浩");
        name.add("戴沐白");
        name.add("李火旺");
        for (String s : name){
            System.out.println(s);
        }
        String[]shuzu = {"小舞","唐三","霍雨浩","戴沐白","李火旺"};
        for (var string : shuzu) {
            System.out.println(string);
        }
    }
}
