package doudiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class coll   {
    public static void main(String[] args) {
        //目标：Colllections工具类
        List<String> list =new ArrayList<>();
//        list.add("张无忌");
//        list.add("周芷若");
//        list.add("赵敏");
//        list.add("张强");
//        list.add("张三丰");
//        list.add("张三丰");
//        list.add("张翠山");
        //↑上面的方法太低级了，居然还要自己手动一个一个加
        //↓下面的方法是我用Collection工具了类来完成的加数据
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","张三丰","张翠山");
        System.out.println(list);
        //                                 后面加的数据必须得跟前面的一样，最少前面那个也得是父类
        //2.0打乱顺序
        Collections.shuffle(list);//打乱顺序
        System.out.println(list);
    }

}

