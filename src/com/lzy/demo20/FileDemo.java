package com.lzy.demo20;

import com.lzy.demo11.test;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.function.BiPredicate;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("D:\\test");
//        String path = file.getAbsolutePath();
//        System.out.println(path);
//        String property = System.getProperty("user.dir");
//        System.out.println(property);
//        long modified = file.lastModified();
//        System.out.println(modified);
//        String[] list = file.list();
//        String string = Arrays.toString(list);
//        System.out.println(string);
//        File file1 = new File("D:\\test\\a.txt");
//
//        String absolutePath = file1.getAbsolutePath();
//        System.out.println(absolutePath);
//        File file2 = new File("d:\\test1\\b.txt");
//        file1.renameTo(file2);
//        File file3 = new File("d:\\test1\\c.txt");
//        file2.renameTo(file3);
//        File[] roots = File.listRoots();
//        System.out.println(Arrays.toString(roots));
//        File file1 = new File("d://nodejs");
//        String[] list = file1.list((filePath,fileName)->fileName.endsWith("js"));
//        String s = Arrays.toString(list);
//        System.out.println(s);
        listFile(new File("D://Program Files"));
        File file1 = new File("d://output.txt");
        System.out.println(file1.getName().endsWith(".txt"));


    }

    static void listFile(File file) {

        File[] file1 = file.listFiles((fileName) -> fileName.getName().endsWith(".txt"));
        System.out.println(Arrays.toString(file1));
        for (int i = 0; i < file1.length; i++) {
            if (file1[i].isDirectory()) {
                listFile(file1[i]);
            }
        }
    }
}
