package mapppp;
import java.util.*;

public class shili  {
 public static void main(String[] args) {
//目标    ：完成map集合相关案例：投票统计程序
     fangfa();
}
public static void fangfa(){
//  1.把八十 个学生投票的数据拿到程序中来，才可以统计投票结果
    List<String >xuanxiang=new ArrayList<>();
    String[] name={"玉龙雪山","长城","璃粵","少林寺"};
    Random random = new Random();
    for (int i = 1; i <80 ; i++) {
//        xuanxiang.add(name[(int)(Math.random()*4)]);
        var i1 = random.nextInt(name.length);//0   1   2   3
                xuanxiang.add(name[i1]);

    }
    System.out.println(xuanxiang);
    //2.把投票数据，进行统计，结果保存在Map集合中
    //最终统计的结果是键值对的形式：所以创建一个Map集合
    Map<String,Integer> map=new HashMap<>();
    System.out.println(map);
    //遍历80个学生的投票数据，来统计结果
    for (String s : xuanxiang) {
        //判断当前学生名字，是否已经存在，如果存在，就累加1
//        if (map.containsKey(s)){
//            //存在就加一
//            map.put(s,map.get(s)+1);
//
//        }else {
////这个景点不存在，就添加1
//            map.put(s,1);
//        }
        map.put(s,map.getOrDefault(s,0)+1);

    }
    System.out.println(map);
    map.forEach((k,v)->System.out.println(k+"--"+v));
    System.out.println("===========================");
     }

}
