package com.lzy.demo11;

import java.util.ArrayList;
import java.util.List;

public class getSubString {
    public static void main(String[] args) {

        String sub = "abc";
        String s = "afjskjkfjsslabcdjjfkjklabcfjkjabc";
        List list = new ArrayList();

        for (int i = 0; i < s.length() - 2; i++) {
            String substring = s.substring(i, i + 3);
            System.out.println(substring);
            if (substring.equals(sub)) {
                list.add(i);
            }
        }
        String s1 = list.toString();
        System.out.println(s1);

    }
}
