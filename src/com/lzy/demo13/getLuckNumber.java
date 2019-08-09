package com.lzy.demo13;

import java.util.*;
import java.util.stream.IntStream;

public class getLuckNumber {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList list = new ArrayList();
        int[] array = random.ints(11, 0, 12).toArray();
        for (int i = 0; i < 5; i++) {
            int x = random.nextInt(11);
            int num = array[x];
            while (list.contains(num)) {
                x = random.nextInt(11);
                num = array[x];
            }
            list.add(num);

        }
        Collections.sort(list);
        System.out.println(list.toString());


    }
}
