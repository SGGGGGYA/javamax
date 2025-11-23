package sethashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class setdamo2 {
    public static void main(String[] args) {
    student s1 = new student( "张三", 18, "北京", "123456")  ;
        student s2 = new student( "lous", 18, "北京", "456789")  ;
student s3 = new student( "张三", 18, "北京", "123456")  ;
        student s4 = new student( "lous", 18, "北京", "456789")  ;
        Set<student> set = new LinkedHashSet<>();//为什么不去掉重复数据，因为他们的哈希值不一样，所以会添加进去
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);
        //要重写父类的hashCode方法
        //还要重写父类的equals方法



    }
}
