package com.lzy.demo02;

import lombok.Getter;
import lombok.Setter;
import lombok.Synchronized;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.*;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Fileoperate {

    @Test
    public void makeDir() {
        File file = new File("d://aaa/bbb/ccc");
        boolean mkdir = file.mkdirs();
        System.out.println(mkdir);
    }

    @Test
    public void deleteDir() {
        File file = new File("d://aaa/bbb/ccc");
        boolean deleteDir = file.delete();
        System.out.println(deleteDir);
    }

    @Test
    public void mkFileText() throws IOException {
        File file = new File("d://aaa/bbb/zzz.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }

    @Test
    public void deleteFileText() {
        File file = new File("d://aaa/bbb/zzz.txt");
        boolean deleteFile = file.delete();
        System.out.println(deleteFile);
    }

    public void listFile(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                listFile(file1);
            }
            System.out.println(file1.getName());
        }

    }

    @Test
    public void TestListFile() {
        boolean exists = new File("d://Program Files").exists();
        System.out.println(exists);
        listFile(new File("d://Program Files"));
    }


    //D://testFile
    public void copyFile(String aimFile, String targetFile) {
        File file = new File(targetFile);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            FileUtils.copyDirectory(new File(aimFile), new File(targetFile));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testCopyFile() {
        copyFile("D://testFile", "D://testFile1");
        System.out.println();

    }

    @Test
    public void write() throws IOException {
        File file = new File("d://aa.txt");
        FileWriter fileInput = new FileWriter(file);

        BufferedWriter bufferedWriter = new BufferedWriter(fileInput);
/*
        将进酒
        君不见黄河之水天上来，奔流到海不复回。
        君不见高堂明镜悲白发，朝如青丝暮成雪。
        人生得意须尽欢，莫使金樽空对月。
        天生我材必有用，千金散尽还复来。
        */

        bufferedWriter.write("将进酒");
        bufferedWriter.newLine();
        bufferedWriter.write("君不见黄河之水天上来，奔流到海不复回。");
        bufferedWriter.newLine();
        bufferedWriter.write(" 君不见高堂明镜悲白发，朝如青丝暮成雪。");
        bufferedWriter.newLine();
        bufferedWriter.write(" 人生得意须尽欢，莫使金樽空对月。");
        bufferedWriter.newLine();
        bufferedWriter.write("天生我材必有用，千金散尽还复来。");
        bufferedWriter.flush();
        bufferedWriter.close();


    }


    @Test
    public void sortArray() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[]{1, 5, 6, 7, 8, 9, 4, 3, 2, 10};

        Arrays.sort(nums);


        File file = new File("d://aa.txt");
        FileWriter fileInput = null;
        try {
            fileInput = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileInput);
            for (int num : nums) {
                printWriter.print(num);
            }
        } catch (IOException e) {
            e.printStackTrace();


        }


    }

    @Test
    public void wirteObjectbBytext() throws IOException {
        File file = new File("d://aa.txt");
        FileWriter fileInput = new FileWriter(file);
        Person person1 = new Person("lzy", 123);
        Person person2 = new Person("lzy", 123);
        BufferedWriter bufferedWriter = new BufferedWriter(fileInput);
        bufferedWriter.write(person1.getName() + "      " + person1.getOld());
        bufferedWriter.newLine();
        bufferedWriter.write(person2.getName() + "      " + person2.getOld());
        bufferedWriter.close();
    }

    @Test
    public void wirteObject() throws IOException {
        File file = new File("d://aa.txt");
        FileOutputStream fileOutputStreamput = new FileOutputStream(file);
        Person person1 = new Person("lzy", 123);
        Person person2 = new Person("lzy", 123);
        ObjectOutputStream objecto = new ObjectOutputStream(fileOutputStreamput);
        objecto.writeObject(person1);
        objecto.writeObject(person2);

    }


}


