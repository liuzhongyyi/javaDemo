package com.lzy.demo11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class getSubString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String s = scanner.next();
        System.out.println("输入匹配子串");
        String sub = scanner.next();

        //String sub = "abc";
        //String s = "afjskjkfjsslabcdjjfkjklabcfjkjabc";
        List list = new ArrayList();

        for (int i = 0; i < s.length() - sub.length() + 1; i++) {
            String substring = s.substring(i, i + sub.length());
            System.out.println(substring);
            if (substring.equals(sub)) {
                list.add(i);
            }
        }
        String s1 = list.toString();
        System.out.println(s1);

    }
}
