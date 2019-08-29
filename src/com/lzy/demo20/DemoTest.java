package com.lzy.demo20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class DemoTest {

    public static void main(String[] args) {

        printListFileAndChilrenFile(new File("D://Program Files"));
    }

    /**
     * T1
     *
     * @param file
     */
    static void listFile(File file) {

        File[] file1 = file.listFiles((filePath, fileName) -> !fileName.endsWith(".jsp"));
        System.out.println(Arrays.toString(file1));
        for (int i = 0; i < file1.length; i++) {
            if (file1[i].isDirectory()) {
                listFile(file1[i]);
            }
        }
    }

    /**
     * T3
     *
     * @param file
     */
    static void printListFile(File file) {

        File[] file1 = file.listFiles();
        System.out.println(file.getName() + "子目录为:" + "\t");
        Arrays.asList(file1).stream().forEach((file3) -> {
            System.out.print(file3.getName() + "\t");
        });
        System.out.println();


        for (int i = 0; i < file1.length; i++)
            if (file1[i].isDirectory()) {
                printListFile(file1[i]);
            }
    }

    static void rmoveFileToNewDir(String path) {
        File file = new File("d://a");
        boolean directory = file.isDirectory();
        if (directory) {
            File file1 = new File("d:lzy.txt");
            String name = file.getAbsolutePath();
            file1.renameTo(new File(name + "//" + file1.getName()));
        }
    }

    static void printListFileAndChilrenFile(File file) {

        File[] file1 = file.listFiles();
        System.out.print(file.getName() + "子目录为:" + "\t");
        Arrays.asList(file1).stream().forEach((file3) -> {
            System.out.print(file3.getName() + "\t");
        });
        System.out.println();


        for (int i = 0; i < file1.length; i++)
            if (file1[i].isDirectory()) {
                printListFile(file1[i]);
            }
    }

    static void readFileAndCopyFile(String orign, String des) {
        try (FileInputStream InputStream = new FileInputStream(new File(orign));
             FileOutputStream outputStream = new FileOutputStream(new File(des));) {
            int len = 0;
            byte[] buffer = new byte[1024];
            String s = "";
            while ((len = InputStream.read(buffer)) != -1) {
                outputStream.write(buffer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void copyPic(String orign, String des) {
        try (FileInputStream InputStream = new FileInputStream(new File(orign));
             FileOutputStream outputStream = new FileOutputStream(new File(des));) {
            int len = 0;
            byte[] buffer = new byte[1024];
            String s = "";
            while ((len = InputStream.read(buffer)) != -1) {
                outputStream.write(buffer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
