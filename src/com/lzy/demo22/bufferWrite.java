package com.lzy.demo22;

import java.io.*;

public class bufferWrite {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("d://output.txt")));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("d://output.txt")));
        //bufferedWriter.write("刘忠意");
        //bufferedWriter.flush();
//        FileReader bufferedReader = new FileReader(new File("d://cc.txt"));
        String s;
        char[] buff = new char[1024];
        int len = 0;
        while ((len = bufferedReader.read(buff)) != -1) {
            System.out.println(new String(buff, 0, len));
        }
        bufferedReader.close();
    }

}
