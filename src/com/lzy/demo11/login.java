package com.lzy.demo11;

import java.util.Scanner;

public class login {

    private static final int MAX_COUNT = 3;

    public static void main(String[] args) {
        System.out.println("******************");
        System.out.println("**欢迎登陆K3蓝桥系统***");
        System.out.println("******************");
        String a = "lq";
        String b = "123456";
        Scanner in = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            System.out.println("请输入用户名:");
            String c = in.next();
            System.out.println("请输入密码:");
            String d = in.next();
            if (a.equals(c) && b.equals(d)) {
                System.out.print("输入正确！");
                System.out.print("欢迎登陆K3蓝桥系统！");
                break;
            } else {
                System.out.print("输入错误！你还有" + (i - 1) + "次机会！");
            }
        }
        in.close();

    }

}
