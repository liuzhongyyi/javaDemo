package com.lzy.demo16;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class swich {
    public static void main(String[] args) {
        int[] array = {1, 8, 9, 5, 2, 4};
        System.out.println(Arrays.toString(selectionSort(array)));

    }

    public static Integer[] sort(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        list.sort(
                (o1, o2) -> {
                    return o1.intValue() > o2.intValue() ? 1 : -1;
                });
        System.out.println(list.toString());
        Collections.reverse(list);
        return (Integer[]) list.toArray();
    }

    public static int[] bubbleSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j + 1] > array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
        return array;
    }


    public static int[] selectionSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[minIndex])
                    minIndex = j;
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;


    }
}
