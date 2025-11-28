package io.kuangjia;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class io框架 {
    public static void main(String[] args) throws IOException {
//目标：掌握io框架

FileUtils.copyFile( new File("E:\\xiangmu\\javamax\\day03\\src\\liele.txt"), new File("E:\\xiangmu\\javamax\\day03\\src\\liele1.txt"));//拷贝
        //jdk1.7提供的
//        Files.copy(Path.of("E:\\xiangmu\\javamax\\day03\\src\\liele.txt"), Path.of("E:\\xiangmu\\javamax\\day03\\src\\liele2.txt") );
    FileUtils.deleteQuietly(new File("E:\\xiangmu\\javamax\\day03\\src\\liele1.txt"));//删除  ad
    }
}


