package doudiz;

import java.util.*;

public class room {
    //1准备54张牌，给房间使用：定义一个容器装54张牌

    private List<牌类 > pai =new ArrayList <牌类>();
    //  2.初始化54张牌进去 。
    {//这个是实例代码块
        //3.准备点数
        String[]dainshu={ "3","4","5","6","7","8","9","10","J","Q" ,"K","A","2"};

        //4.准备花色
        String[]hua={ "♥","♦","♣","♠"}  ;
         //5.组合花色
        int daxiao=0;//牌大小
        for (String size: dainshu) {
            daxiao++ ;//牌大小
           for (String color : hua) {
               //创建牌对象
               牌类 牌类 = new  牌类( size , color, daxiao );
               //加入到集合对象
                pai.add(牌类);
           }
        }
//        pai.add(new 牌类( "大王","红"));
//        pai.add( new 牌类( "小王","黑") );
 //             ↑↓两个都一样的
        Collections.addAll( pai,new 牌类( "大王","红",++daxiao) ,new 牌类( "小王","黑",++daxiao   ));
        System.out.println( "新牌是"+ pai);
    }
    public void qidong() {
        //洗牌；随机打乱牌的顺序
        Collections.shuffle(pai);
        System.out.println( "洗牌后："+pai);
        //9.发牌；定义三个玩家；45aaa=[]，36bbb=[]，24ccc=[]可以用map来做
        Map<String,List<牌类>> wanp=new HashMap<>();
        ArrayList<牌类> lhc = new ArrayList<>();

        wanp.put( "45aaa",lhc);
        ArrayList<牌类> lhb = new ArrayList<>();
        wanp.put("36bbb",lhb );
        ArrayList<牌类> lhg = new ArrayList<>();
        wanp.put( "24ccc",lhg );
      //发牌给3个人
        //只发51张
        for (int i = 0; i < pai.size()-3; i++) {
            //获取到当前遍历的牌
            牌类 pai1=pai.get(i);
            if ( i  %3==0){
                lhc.add( pai1 );
            }else if (i%3==1){
                lhb.add( pai1 );
            }else
            {
                lhg.add(pai1);
            }
        }
        //10.对牌排序
        fangfa(lhc);
        fangfa(lhb);
        fangfa(lhg);

        //12.拿三张底牌
        List<牌类> pooo=pai.subList(pai.size()-3,pai.size());
//        牌类 牌类 = pai.get(51);
//        牌类 牌类1 = pai.get(52);
//        牌类 牌类2 = pai.get(53);
//List<牌类>pooo=pai.subList(pai.size()-3,pai.size());
//System.out.println("底牌是："+pooo);
////抢地主：把这个集合直接倒给玩家
        lhb.addAll(pooo);
        fangfa(lhb);

        // 11.看牌,便利map集合
        for (Map.Entry<String,List<牌类>>entry:wanp.entrySet()){
            String key=entry.getKey();
            List<牌类> ppp=entry.getValue();
            System.out.println(key+"ta他的牌是："+ppp);
//            for (牌类 ppp1:ppp){太过复杂
//                System.out.println( key+"="+ppp1 );
//            }
        }
   }

    private void fangfa(ArrayList<牌类> lhg) {
    Collections.sort(lhg, new Comparator<牌类>() {
        @Override
        public int compare(牌类 o1, 牌类 o2) {
            return o2.getDaxiao()-o1.getDaxiao();
        }
    });
    }
}
