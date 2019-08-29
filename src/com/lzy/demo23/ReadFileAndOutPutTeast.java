package com.lzy.demo23;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ReadFileAndOutPutTeast {

    private static final String REAL_PASSWORD = "lanqiao";
    private static HashMap<Character, Integer> hashMap = new HashMap<>();
    private File file;
    private String passWord;


    public ReadFileAndOutPutTeast(File file, String passWord) {
        this.file = file;
        this.passWord = passWord;
        ReadFileAndOutPut();
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    private boolean isFileEmpty() {
        return file == null;
    }

    private boolean isFile() {
        return file.isFile();
    }

    public void setFile(File file) {
        this.file = file;
    }

    private boolean isRealPassword() {
        return passWord == REAL_PASSWORD;
    }

    private void readFileAndSort() {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int len = 0;
            while ((len = fileInputStream.read()) != -1) {
                char c = (char) len;
                if (hashMap.containsKey(c)) {
                    Integer num = hashMap.get(c);
                    hashMap.put(c, ++num);
                }
            }
        } catch (Exception e) {

        }

    }

    private String forMat(Character c, Integer value) {
        return c + ":" + value + "��" + "\n\r";
    }

    public void sentToOtherFile(File file) {
        if (file.isDirectory()) {
            throw new RuntimeException("���������ļ�");
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            Set<Character> keySet = hashMap.keySet();
            for (Character character : keySet) {
                String s = forMat(character, hashMap.get(character));
                bufferedWriter.write(s);

            }

        } catch (Exception e) {

        }
    }

    public void ReadFileAndOutPut() {

        if (isFileEmpty()) {
            throw new NullPointerException("�ļ�Ϊ��");
        }
        if (isFile()) {
            throw new NullPointerException("�����ļ�");
        }
        if (isPasswordEmpty()) {
            throw new RuntimeException("����Ϊ��");
        }
        if (!isRealPassword()) {
            throw new RuntimeException("�������");
        }


    }

    private boolean isPasswordEmpty() {
        return passWord == null || passWord.length() == 0;
    }
}
