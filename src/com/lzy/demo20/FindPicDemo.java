package com.lzy.demo20;

import java.io.File;
import java.util.Arrays;

public class FindPicDemo {

    public static void main(String[] args) {
        renameToAndPrintPic("D://pic");
    }

    static void renameToAndPrintPic(String path) {
        File file = new File(path);
        if (!file.isDirectory()) {
            throw new RuntimeException("错误");
        }
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.getName().endsWith(".png")) ;
            {
                String s = file1.getAbsolutePath();
                String replace = s.replace(".png", ".jpg");
                System.out.println(replace);
                File file2 = new File(replace);
                file1.renameTo(file2);
            }
        }
        String[] list = file.list((filePath, fileName) -> fileName.endsWith(".jsp"));
        Arrays.asList(list).forEach(System.out::println);
    }
}
