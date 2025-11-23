package file.digui;

public class 递归 {

    public static void main(String[] args) {
        //目标：掌握递归的思路、
        di();
    }
    public static void di(){
        System.out.println("====执行===");

        di();//递归，自己调用自己，出现死循环，导致了内存溢出
    }

}
