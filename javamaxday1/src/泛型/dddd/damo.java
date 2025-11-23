package 泛型.dddd;

import java.util.ArrayList;

public class damo {

    public static void main(String[] args) {
        //// 目标:搞清楚泛型和集合不支持基本数据类型，只能支持对象类型(引用数据类型)。
//  报错      ArrayList<int> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        // 泛型擦除:泛型工作在编译阶段，等编译后泛型就没用了，所以泛型在编译后都会被擦除。所有泛型都会被替换成Object。
list.add(12);
//Object o=12
//把基本数据变成包装对象
        //手工包装：
//   从版本九开始就移除了     Integer i = new Integer(12);为什么这个静态方法被移除了呢？
Integer i = Integer.valueOf(12);//记住的不是数据12，而是对象12也就是i
        Integer i2 = Integer.valueOf(12);//推荐
System.out.println(i==i2);

//自动装箱:基本数据类型的数据可以直接变成包装对象的数据，不需要额外做任何事情
        Integer i3 = 12;//自动装箱 Integer i3 = 12;就等于Integer i3 = Integer.valueOf(12);
        Integer i4 = 155;
        Integer i5 = 155;
        System.out.println(i4==i5);// false因为155和155两个数据，两个数据是不同的超过了Integer.MAX_VALUE所以是两个对象
        //自动拆箱:把包装类型的对象直接给基本类型的数据
    int i6 = i3;
    System.out.println(i6);
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(123);//自动装箱
        list2.add(456);//自动搞一个对象
        int re = list.get(0);//自动拆箱
        System.out.println("=====================================================================================");
        //包装类新增的 功能
        //一个包装类对象，可以调用intValue()方法，把对象变成int数据。
        //把基本类型的数据装换成字符串
        int i7 = 123;
        var string = Integer.toString(i7);//字符串23
System.out.println(string+"1");
String string2 = i7+"";//任意内容+""就是字符串

System.out.println("====================================================");
//把字符串数值装换成对应的基本数据类型“很有用”
        String s1 = "123";
        int i10 = Integer.parseInt(s1);//开发中int和Int都可以用除了泛型等
         Integer i11 = Integer.valueOf(s1);
        System.out.println(i10+1);
        System.out.println(i11+1);
        System.out.println("====================================================");
        System.out.println(string2+"1");
        //包装类对象，可以调用parseInt()方法，把字符串转换成int数据。
        String s = "123";
        int i8 = Integer.parseInt(s);
        System.out.println(i8+1);
        //包装类对象，可以调用valueOf()方法，把字符串转换成包装类对象。
        String s2 = "123";
        Integer i9 = Integer.valueOf(s2);
        System.out.println(i9+1);
    }
}
