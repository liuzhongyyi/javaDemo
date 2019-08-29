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
        return c + ":" + value + "个" + "\n\r";
    }

    public void sentToOtherFile(File file) {
        if (file.isDirectory()) {
            throw new RuntimeException("参数不是文件");
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
            throw new NullPointerException("文件为空");
        }
        if (isFile()) {
            throw new NullPointerException("不是文件");
        }
        if (isPasswordEmpty()) {
            throw new RuntimeException("密码为空");
        }
        if (!isRealPassword()) {
            throw new RuntimeException("密码错误");
        }


    }

    private boolean isPasswordEmpty() {
        return passWord == null || passWord.length() == 0;
    }
}
