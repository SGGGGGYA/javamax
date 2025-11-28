package file.damobianma;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class io流框架
{
   //用commons-io框架来拷贝视频，请你加一个记时间的功能
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        FileUtils.copyFile( new File("E:\\SteamLibrary\\steamapps\\workshop\\content\\431960\\2994046686\\2023原神合集-viciNEKO.mp4"), new File("E:\\111.mp4"));
        long end = System.currentTimeMillis();
        System.out.println("拷贝完成，耗时：" + (end - start) + "毫秒");
        System.out.println("拷贝完成");
    }

}
