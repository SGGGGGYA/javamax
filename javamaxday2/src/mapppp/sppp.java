package mapppp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class sppp {
    public static void main(String[] args) {
//认识，map集合体系特点
        //创建一个map集合
        //map的特点：无序，无索引，存储键值对，键不能重复，值可以重复，键值对都可以存在null，值不作要求（可以重复）、、整个map集合的特点
        //LinkedHashMap的特点：有序，键值对无索引，键不能重复，值可以重复，键值对都可以存在null，值不作要求（可以重复）、、整个map集合的特点
        //HashMap的特点：无序，无索引，存储键值对，键不能重复，值可以重复，键值对都可以存在null，值不作要求（可以重复）、、整个map集合的特点
        //treeMap的特点：有排序，无索引，存储键值对，键不能重复，值可以重复，键值对都可以存在null，值不作要求（可以重复）、、整个map集合的特点
        //如果键重复，值会覆盖
//        Map<String, Integer> maap = new HashMap<>();//一行经典代码
        Map<String, Integer> maap = new LinkedHashMap<>();//有序的
        maap.put("嫦娥", 18);//添加数据

        maap.put("唐僧", 12);
        maap.put("紫霞仙子", 31);
        maap.put("赵六", 20);
        maap.put("嫦娥", 118);
        maap.put("小王", 18);
        maap.put(null, null);
        maap.put(null, null);
        System.out.println(maap);//{嫦娥=18, 唐僧=12, 紫霞仙子=31, 赵六=20, 小王=18, null=null}

    }
}
