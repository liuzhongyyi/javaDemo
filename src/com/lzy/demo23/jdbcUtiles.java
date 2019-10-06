package com.lzy.demo23;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class jdbcUtiles {
    private static ThreadLocal<Connection> local = new ThreadLocal();
    private static DataSource dataSource;

    static {
        ClassLoader classLoader = FileOp.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("db.properties");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
            if (dataSource == null) {
                dataSource = DruidDataSourceFactory.createDataSource(properties);
                System.out.println(dataSource);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//    public static void init() throws Exception {
//        ClassLoader classLoader = FileOp.class.getClassLoader();
//        InputStream resourceAsStream = classLoader.getResourceAsStream("db.properties");
//        Properties properties = new Properties();
//        properties.load(resourceAsStream);
//        if (dataSource == null) {
//          dataSource = DruidDataSourceFactory.createDataSource(properties);
//            System.out.println(dataSource);
//        }
//
//    }

    public static Connection getConnection() throws Exception {
        // init();
        Connection connection = local.get();
        if (connection == null) {
            connection = dataSource.getConnection();
            local.set(connection);

        }

        return connection;

    }

    public static void commitAndClose() throws Exception {
        if (getConnection() != null) {
            Connection connection = getConnection();
            connection.setAutoCommit(false);
            connection.commit();
            connection.close();
            local.remove();
        }
    }


    public static void RollbackAndClose() throws Exception {
        if (getConnection() != null) {
            Connection connection = getConnection();
            connection.rollback();
            connection.close();
            local.remove();
        }
    }

    public static void main(String[] args) throws Exception {

        Connection connection = getConnection();
        System.out.println(connection);

    }
}
