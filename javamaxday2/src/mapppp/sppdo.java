package mapppp;
import java.util.*;

public class sppdo {
    public static void main(String[] args) {
        //目标:掌握Map的常用方法。
        Map<String, Integer> maap = new LinkedHashMap<>();//有序的
        maap.put("嫦娥", 18);//添加数据
System.out.println(maap.put("嫦娥", 118));//18
        maap.put("唐僧", 12);
        maap.put("紫霞仙子", 31);
        maap.put("赵六", 20);
        maap.put("嫦娥", 118);
        maap.put("小王", 18);
        maap.put(null, null);
        maap.put(null, null);
        System.out.println(maap);//{嫦娥=18, 唐僧=12, 紫霞仙子=31, 赵六=20, 小王=18, null=null}
//写代码演示常用方法
        System.out.println(maap.get("小王"));//18，根据键获取值
        System.out.println(maap.get("小王1"));//null，根据键获取值
        System.out.println(maap.containsKey("小王"));//true  判断是否包含指定的键
        System.out.println(maap.containsKey("小王1"));//false 判断是否包含指定的键
        System.out.println(maap.containsValue(18));//true 判断是否包含指定的值
        System.out.println(maap.containsValue(19));// false 判断是否包含指定的值
        System.out.println(maap.remove("小王"));//18 删除键值对，返回被删除的键值对 键不存在返回null
        System.out.println(maap.remove("小王1"));//null 删除键值对，返回被删除的键值对 键不存在返回null

        System.out.println(maap.size());//6 获取键值对的个数
        System.out.println(maap.remove("小王"));//18 删除键值对，返回被删除的键值对 键不存在返回null
//        System.out.println(maap.isEmpty());//false 判断集合是否为空
//        maap.clear();//清空集合
        System.out.println(maap.isEmpty()); //true 判断集合是否为空

         Set<String> strings = maap.keySet();//获取所有的键的集合放到Set集合中
          for (String key : strings){
              System.out.println(key+"--"+maap.get(key));
              //获取所有的值放到Collection集合中返回给我们

          }
        Collection<Integer> values = maap.values();
        for (var value : values) {
        System.out.println(value);
        }
    }
}
