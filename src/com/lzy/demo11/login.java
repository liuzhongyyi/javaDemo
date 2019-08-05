package com.lzy.demo11;

import java.util.Scanner;

public class login {

    private static final int MAX_COUNT = 3;

    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = scanner.next();
        System.out.println("请输入密码");
        String passWord = scanner.next();
        while ((!("lq").equals(userName) && !("123456").equals(passWord))) {
            System.out.println("密码错误，你还有" + (MAX_COUNT - i) + "次机会");

            System.out.println("请输入用户名");
            userName = scanner.next();
            System.out.println("请输入密码");
            passWord = scanner.next();
            if (i == MAX_COUNT) {
                System.out.println("你没有机会");
                break;
            }
            i++;
        }
        if (i < MAX_COUNT)
            System.out.println("登录成功");
    }
}
