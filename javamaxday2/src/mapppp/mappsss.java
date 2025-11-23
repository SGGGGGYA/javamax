import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mappsss {
    // 目标:掌握Map集合的遍历方式一:键找值。
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("嫦娥",2);
        map.put("女儿国王",31);
        map.put("嫦娥",28);
        map.put("铁扇公主",8);
        map.put("紫霞",31);
        map.put(null, null);System.out.println(map);
//            for (String key : map.keySet()) {//遍历集合，获取每一个键
//                System.out.println(key+"--"+map.get(key));//输出键值对
//            }
            Set<String> keys = map.keySet();//获取所有的键的集合
            for (String key : keys)//遍历set集合，获取每一个键
            {
                    Integer value = map.get(key);//根据键获取值
                    System.out.println(key+"--"+value);//输出键值对
                }
        System.out.println("=====================================");
            Set<Map.Entry<String, Integer>> entries = map.entrySet();//获取所有的键值对
        for (Map.Entry<String, Integer> entry : entries) {//遍历set集合，获取每一个键值对
        System.out.println(entry.getKey()+"--"+entry.getValue());//输出键值对
//        entry.setValue(entry.getValue()+1);//修改值
//        System.out.println(entry.getKey()+"--"+entry.getValue());//输出键值对
//        System.out.println(map); //输出集合
        }



    }
}
