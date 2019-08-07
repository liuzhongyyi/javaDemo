package com.lzy.demo11;

import java.util.Arrays;

public class orderword {
    public static void main(String[] args) {


        char ch[] = {'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z'};
        Arrays.sort(ch);
        System.out.println("升序结果:");
        for (int index = 0; index < ch.length; index++) {
            System.out.print(ch[index] + "\t");
        }
        System.out.println(" ");
        System.out.println("降序结果:");
        for (int index = ch.length - 1; index >= 0; index--)
            System.out.print(ch[index] + "\t");
    }


}
