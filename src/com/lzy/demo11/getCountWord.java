package com.lzy.demo11;


import java.util.Scanner;

public class getCountWord {
    public static void main(String[] args) {
        int n = 0;
        int l = 0;
        int u = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = input.next();
        char[] letters = s.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if ('0' <= letters[i] && '9' >= letters[i]) {
                n++;
            } else if ('a' <= letters[i] && 'z' >= letters[i]) {
                l++;
            } else if ('A' <= letters[i] && 'Z' >= letters[i]) {
                u++;
            }
        }
        System.out.println("数字出现过" + n + "次\n");
        System.out.println("小写字母出现过" + l + "次\n");
        System.out.println("大写字母出现过" + u + "次\n");
        input.close();
    }

}

