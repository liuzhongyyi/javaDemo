package com.lzy.demo22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Transforio {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("d://output.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "GBK");
            int read = inputStreamReader.read();
            System.out.println((char) read);

        } catch (Exception e) {

        }
    }

}
