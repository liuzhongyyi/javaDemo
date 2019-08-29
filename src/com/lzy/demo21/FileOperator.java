package com.lzy.demo21;

import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

public class FileOperator {
    public static void main(String[] args) throws IOException {

        copyWord("D://output.txt", "d://ee.txt");
    }

    public static void createFileAndRemove() throws IOException {
        File file = new File("e://HelloFile.txt");
        file.createNewFile();
        File file1 = new File("e://IoTest");
        file1.mkdir();
        File file2 = new File(file1.getAbsolutePath() + "//" + file.getName());
        System.out.println(file2.getAbsolutePath());
        file.renameTo(file2);

    }

    public static void printFile() {
        File file = new File(".");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        File[] files = file.listFiles();
        Arrays.asList(files).stream().forEach(System.out::println);
        System.out.println("-----------------------");
        System.out.println(file.getAbsolutePath());
        File[] files1 = file.listFiles((filePah, fileName) -> fileName.substring(0, 1).equals("s"));
        Arrays.asList(files1).stream().forEach(System.out::println);

    }

    public static void listFiles(File file) {

        File[] file1 = file.listFiles((filePath, fileName) ->
        {
            File file3 = new File(filePath, fileName);
            if (file3.isDirectory() || fileName.endsWith(".java")) {
                return true;
            } else {
                return false;
            }
        });
        if (file1.length > 0) {
            for (int i = 0; i < file1.length; i++) {
                if (!file1[i].isDirectory()) {
                    System.out.println(file1[i].getName());
                }
            }
        }

        for (int i = 0; i < file1.length; i++) {
            if (file1[i].isDirectory()) {
                listFiles(file1[i]);
            }
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
                printListFileAndChilrenFile(file1[i]);
            }
    }

    static void readFileAndCopyFile(String orign, String des) {
        try (FileInputStream InputStream = new FileInputStream(new File(orign));
             FileOutputStream outputStream = new FileOutputStream(new File(des));) {
            int len = 0;
            byte[] buffer = new byte[1024];
            String s = "";
            while ((len = InputStream.read(buffer)) != -1) {
                s = s + new String(buffer);
                outputStream.write(s.getBytes());
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

    static void copyWord(String orign, String des) {
        try (FileInputStream InputStream = new FileInputStream(new File(orign));
             FileOutputStream outputStream = new FileOutputStream(new File(des));) {
            int len = 0;
            byte[] buffer = new byte[1024];
            String s = "";
            while ((len = InputStream.read(buffer)) != -1) {
                s = s + new String(buffer);
            }
            TreeSet<Character> characterars = new TreeSet<>();
            Arrays.sort(s.toCharArray());
            for (int i = 0; i < s.toCharArray().length; i++) {
                characterars.add(s.charAt(i));

            }


            Iterator iterator = characterars.iterator();
            while (iterator.hasNext()) {
                outputStream.write(iterator.next().toString().getBytes());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
