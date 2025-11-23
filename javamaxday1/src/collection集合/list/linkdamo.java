package collection集合.list;

import java.util.LinkedList;
import java.util.List;

public class linkdamo {
    public static void main(String[] args) {
        //// 目标:用LinkedList做一个队列对象。
        List<String> queue = new java.util.LinkedList<>();//不要用多态，因为linkedlist独有的功能list集合没有
        LinkedList<String> queue1 = new LinkedList<>();
        //入队
        queue1.addLast("小舞");
       queue1.addLast("赵敏");//排队
       queue1.add("西门崔雪");
       queue1.add("圆神");
       queue1.add("ruxiaofeng");//[小舞, 赵敏, 西门崔雪, 圆神, ruxiaofeng]
        System.out.println(queue1);
        //出队
        System.out.println(queue1.removeFirst());//把小舞删除掉，并打印出来
        System.out.println(queue1.removeFirst());//把赵敏删除掉，并打印出来
        System.out.println(queue1);
        System.out.println("===========================");
        //做一个栈
        LinkedList<String> stack = new LinkedList<>();
        //压栈
        stack.push("第一颗子弹");//public void push(E e) {addFirst(e);}只是包装了一下
        stack.addLast("第二颗子弹");
        stack.addLast("第三颗子弹");
        stack.addLast("第四颗子弹");
        System.out.println(stack);
        //弹栈
        System.out.println(stack.pop());// public E pop() {return removeFirst();}同理

        System.out.println(stack.removeLast());
        System.out.println(stack);
    }
}
