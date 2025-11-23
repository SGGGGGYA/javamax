package collection集合.dianying;

import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class daingy1sss {
    public static List<movie> movies = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public void qid() {
        while (true) {
            System.out.println("=======电影操作系统========");
            System.out.println("1.上架");
            System.out.println("2.下架某个电影");
            System.out.println("3.查询某个电影");
            System.out.println("4.封杀某个明星");
            System.out.println("5.退出系统");
            System.out.println("6.展示全部电影");
            System.out.println("7.修改某个电影");
            System.out.println("请你输入操作命令2：");
            String cmd = sc.next();
            switch (cmd) {
                case "1":
                    addmovie();
                    break;
                case "2":
                    xiad();
                    break;
                case "3":
                    qcerymovie();
                    break;
                case "4":
                    zhansh();
                    break;
                case "5":
                    System.out.println("退出系统");
                    return; // 添加return来真正退出系统
                case "6":
                    System.out.println("============展示全部电影===============");
                    zhangsi();
                    break;
                case "7":
                    xiugai();
                    break;
                default:
                    System.out.println("输入错误");
            }
        }
    }

    private void zhangsi() {
        System.out.println("============展示全部电影===============");
        for (movie m : movies) {
            System.out.println(m.getActor() + "  " + m.getScore() + "  " + m.getPrice() + "  " + m.getName() + "  ");
        }
    }

    private void xiugai() {
        System.out.println("============修改电影===============");
        System.out.println("请输入电影名称：");
        String name = sc.next();
        movie m = dianyingdui(name);
        if (m != null) {
            System.out.println("请输入修改后的电影名称：");
            m.setName(sc.next());
            System.out.println("请输入修改后的电影主演：");
            m.setActor(sc.next());
            System.out.println("请输入修改后的电影价格：");
            m.setPrice(sc.nextDouble());
            System.out.println("修改成功");
        } else {
            System.out.println("没有找到该电影");
        }
    }

    private void qcerymovie() {
        System.out.println("============查询电影==============");
        System.out.println("请输入电影名称：");
        String name = sc.next();
        movie m = dianyingdui(name);
        if (m != null) {
            System.out.println(m.getActor() + "  " + m.getScore() + "  " + m.getPrice() + "  " + m.getName() + "  ");
        } else {
            System.out.println("没有此电影");
        }
    }

    // 封杀某个明星 - 使用迭代器删除
    private void zhansh() {
        System.out.println("============封杀明星===============");
        System.out.println("请输入要封杀的明星：");
        String actorName = sc.next();

        boolean found = false;
        // 使用迭代器遍历集合
        Iterator<movie> iterator = movies.iterator();
        while (iterator.hasNext()) {
            movie m = iterator.next();
            // 检查电影的主演是否包含要封杀的明星
            if (m.getActor().contains(actorName)) {
                iterator.remove(); // 使用迭代器的remove方法安全删除
                found = true;
                System.out.println("已下架明星 '" + actorName + "' 主演的电影: " + m.getName());
            }
        }

        if (found) {
            System.out.println("封杀操作完成");
        } else {
            System.out.println("没有找到该明星主演的电影");
        }
    }

    private movie dianyingdui(String name) {
        for (movie m : movies) {
            if (m.getName().equals(name)) {
                return m;
            }
        }
        return null;
    }

    private void xiad() {
        System.out.println("============下架电影===============");
        System.out.println("请输入电影名称：");
        String name = sc.next();
        movie m = dianyingdui(name);
        if (m != null) {
            movies.remove(m);
            System.out.println("下架成功");
        } else {
            System.out.println("没有此电影");
        }
    }

    private void addmovie() {
        System.out.println("==============上架电影===============");
        movie m = new movie();
        System.out.println("请输入电影名称：");
        m.setName(sc.next());
        System.out.println("请输入电影评分：");
        m.setScore(sc.nextDouble());
        System.out.println("请输入电影主演：");
        m.setActor(sc.next());
        System.out.println("请输入电影价格：");
        m.setPrice(sc.nextDouble());
        movies.add(m);
        System.out.println("上架成功");
    }
}