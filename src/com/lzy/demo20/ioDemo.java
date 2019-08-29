package com.lzy.demo20;


import java.io.*;

public class ioDemo {
    public static void main(String[] args) throws IOException {
        createFile("d://output.txt");
        writeData("d://output.txt");
    }

    public static void createFile(String path) throws IOException {
        if (path != null || path.length() != 0) {
            File file = new File(path);
            boolean newFile = file.createNewFile();
        }
    }

    public static void writeData(String dir
    ) throws IOException {
        if (dir != null || dir.length() != 0) {
            FileOutputStream outputStream = new FileOutputStream(new File(dir), true);
            outputStream.write("王吉康sb".getBytes());

        }
    }

    public static void readAndWrite(String orign, String destination) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(orign));
        FileOutputStream fileOutputStream = new FileOutputStream(new File(destination));
        int len = 0;
        String s = "";
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes)) != -1) {
            s = s + new String(bytes, 0, len);
            fileOutputStream.write(bytes);
        }
    }

}
