package mapppp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ssssssss {public class mappsss {
    // 目标:掌握Map集合的遍历方式二:键找值。
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("嫦娥", 2);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 8);
        map.put("紫霞", 31);
        map.put(null, null);
        System.out.println(map);
//        System.out.println(map);
//for (元素的类型 变量名 : 集合名)
//foe(元素的类型 kv : 集合名)
//        把map集合转换成set集合，里面的元素都是键值对类型（ map.Entry<String,Interger> ）
        /**
         * map ={嫦娥=28, 女儿国王=31, 嫦娥=28, 铁扇公主=8, 紫霞=31, null=null}
         * ↓
         * map entrySet()
         * ↓
         * Set<Map.Entry<String, Integer>>=[ (嫦娥=28),(女儿国王=31),(嫦娥=28),(紫霞=31),(null=null)]
         *                                   增强fou慢慢的取值
         * 用Entry的实现类对象封装了键值对数据放到set集合中
         */






        // 遍历set集合，获取每一个键值对元素
        var entries = map.entrySet();
        for (var entry : entries) {
            var key = entry.getKey();
            var value = entry.getValue();
            System.out.println(key + "--" + value);
//            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

    }
}
}
