package com.lzy.demo12;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class TestArrayCopy {

    public static void main(String[] args) {

        int[] src = {1, 2, 3, 4, 5, 6};
        int[] desc = {1, 1, 1, 1};
        System.arraycopy(src, 1, desc, 2, 2);
        String s = Arrays.toString(desc);
        System.out.println(s);
        boolean empty = StringUtils.isEmpty("");
        System.out.println(empty);


    }
}
