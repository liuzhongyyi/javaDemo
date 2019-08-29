package com.lzy.demo21;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class FileReaderDemo {
    public static void main(String[] args) {
        printToFile("./c.txt");
    }

    static void WriteWord(String path) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write("王吉康" + "\r\n" + "aabb", 0, 3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void ReadSingleWord(String path) {
        try (FileReader reader = new FileReader(path)) {
            int len = 0;
            //char[] buffer =new char[1024];

            while ((len = reader.read()) != -1) {

                System.out.print((char) len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    static void ReadWord(String path) {
        try (FileReader reader = new FileReader(path)) {
            int len = 0;
            char[] buffer = new char[1024];

            while ((len = reader.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void printToFile(String path) {
        try (FileWriter writer = new FileWriter(path)) {
            ArrayList<Integer> list = new ArrayList<>();
            Random random = new Random();
            int size = 0;
            while (size < 10) {
                int value = random.nextInt(100) + 1;
                if (!list.contains(value) && (value % 2 == 0)) {
                    list.add(value);
                    size++;
                }


            }
            Collections.sort(list, (num1, num2) -> num2 - num1);
            //System.out.println(list);
            IntStream.generate(() -> new Random().nextInt(100)).filter(value -> value % 2 == 0).distinct().limit(10).sorted().unordered().mapToObj(value -> value + ",").map(value -> new String(value.toCharArray(), 0, value.length() - 1)).toArray();


            //String s1 = Arrays.toString(ints);
            //System.out.println(s1);
            for (int i = 0; i < list.size(); i++) {

                if (i == size - 1) {
                    String s = list.get(i) + "";
                    //System.out.println(s);
                    writer.write(list.get(i) + "");
                } else {
                    writer.write(list.get(i) + ",");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
