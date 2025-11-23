
package mapppp;
import sethashset.laosi;
import sethashset.student;

import java.util.Map;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
//目标:掌握TreeMap集合的使用。
        Map<laosi, Integer> map = new TreeMap<>( ( t1, t2) ->   Double.compare(t2.getSalary(), t1.getSalary() ));//按照键升序排序
        map.put(new laosi("laop", 148, 10500), 128);
        map.put(new laosi("小伟", 128, 10003), 183);
        map.put(new laosi("小玩", 138, 10050), 184);
        map.put(new laosi("kimoji", 158, 11000), 158);
        map.put(new laosi("小王", 18, 10050), 128);

         System.out.println(map);
    }

}

