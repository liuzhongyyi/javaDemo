package com.lzy.demo28;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        Arrays.parallelPrefix(array, (n1, n2) -> n1 + n2);
        String s = Arrays.toString(array);
        System.out.println(s);
        System.out.println("lzy");
    }

}
