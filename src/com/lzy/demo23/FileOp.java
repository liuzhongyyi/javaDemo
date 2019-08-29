package com.lzy.demo23;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import java.io.*;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Properties;
import java.util.Random;
import java.util.stream.IntStream;

public class FileOp {
    public static void main(String[] args) throws SQLException, IOException {
        ClassLoader classLoader = FileOp.class.getClassLoader();


        InputStream resourceAsStream = classLoader.getResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setConnectProperties(properties);
//        druidDataSource.setPassword("123456");
//        druidDataSource.setUsername("root");
//        druidDataSource.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8");
//        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");

        QueryRunner queryRunner = new QueryRunner(druidDataSource);

        System.out.println(queryRunner);

//        File file = new File("G://Ñ§Ï°±Ê¼Ç");
//        boolean exists = file.exists();
//        System.out.println(exists);
//        copyFile(new File("D://out"),new File("D://eee"));

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

    public static void copyFile(File file1, File file2) {
        File[] files = file1.listFiles((filePath, fileName) -> fileName.endsWith(".java"));
        String s = Arrays.toString(files);
        System.out.println(s);
        for (File file : files) {
            String name = file.getName();
            File file3 = new File(file2.getAbsolutePath() + "\\" + name);
            System.out.println(file3.getAbsolutePath());
            file.renameTo(file3);
        }
        File[] files1 = file2.listFiles();
        for (File file : files1) {
            String name = file.getAbsolutePath();
            String replace = name.replace("java", "txt");
            File file3 = new File(name);
            file.renameTo(file3);
        }
    }


    public static void randomNumAndSave(File file) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            IntStream.generate(() -> new Random().nextInt(110) + 80).distinct().limit(20).forEach((num) -> {
                try {
                    fileOutputStream.write(num);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void listFile(File file) {

        File[] file1 = file.listFiles((fileName) -> fileName.getName().endsWith(".txt"));
        System.out.println(Arrays.toString(file1));
        for (int i = 0; i < file1.length; i++) {
            if (file1[i].isDirectory()) {
                listFile(file1[i]);
            }
        }
    }
}

