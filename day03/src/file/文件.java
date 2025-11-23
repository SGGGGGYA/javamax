package file;

import java.io.File;

public class 文件 {
    public static void main(String[] args)  throws Exception{
        //目标：创建File对象代表文件（   文件/目录），搞清楚其提供的对文件进行操作的方法。
    //创建文件对象，去获取某个文件的信息
        File f1=new File("E:\\下载\\空美町动态壁纸（保存后下载）\\往期30套动态壁纸\\爱莉希雅 静态图.jpg");
        System.out.println(f1.getName());//获取文件名
        System.out.println(f1.length());//获取文件大小
        System.out.println(f1.getAbsolutePath());//获取绝对路径
        System.out.println(f1.isFile());//判断是否是文件
        System.out.println(f1.isDirectory());//判断是否是目录
        System.out.println(f1.exists());//判断是否存在
        System.out.println(f1.canRead());//判断是否可读
        System.out.println(f1.canWrite());//判断是否可写
        System.out.println(f1.isHidden());//判断是否隐藏
        System.out.println(f1.lastModified());//获取最后修改时间
        System.out.println(f1.getParent());//获取父目录
        System.out.println(f1.getPath());//获取路径
        System.out.println(f1.getFreeSpace());//获取剩余空间
        System.out.println(f1.getTotalSpace());///获取总空间
        System.out.println(f1.getUsableSpace());//获取可用空间
        System.out.println(f1.getAbsoluteFile());//获取绝对路径
//        System.out.println(f1.getCanonicalFile());//获取规范路径
//        System.out.println(f1.getCanonicalPath());//获取规范路径


        //2、可以使用相对路径定位文件对象
// 只要带盘符的都称之为:绝对路径E:/resourEe/dlei.jpg
//相对路径:不带盘符，默认是到你的idea工程下直接寻找文件的。一般用来找工程下的项目文件的。
//创建// 3、创建对象代表不存在的文件路径
        File f2=new File("E:\\xiangmu\\javamax\\dilei.txt");
        System.out.println(f2.exists());//判断是否存在
        System.out.println(f2.createNewFile());//创建文件
        //4.创建对象代表不存在的目录
        File f3=new File("E:\\xiangmu\\yaun");
        System.out.println(f3.exists());
        System.out.println(f3.mkdir());//创建目录，只可以创建一级目录
        System.out.println(f3.mkdirs());//创建多级  目录
//5、创建File对象代表存在的文件，然后删除它
        File f4=new File("E:\\xiangmu\\javamax\\dilei.txt");
        System.out.println(f4.exists());
        System.out.println(f4.delete());//删除文件
        //6.创建File对象代表存在的目录，然后删除它
        File f5=new File("E:\\xiangmu\\yaun");
        System.out.println(f5.exists());
        System.out.println(f5.delete());//删除目录,注意：目录下有文件，不能删除
        //8、可以获取某个目录下的全部文件名称
        File f6=new File("E:\\xiangmu\\javamax");
        String[] names=f6.list();//获取目录下的全部文件名称
        for (String name : names) {
            System.out.println(name);
        }
        File[] files=f6.listFiles();//获取目录下的全部文件对象
        for (File file : files) {
            System.out.println(file);
        }










    }
}
