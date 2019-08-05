package com.lzy.demo11;

public class getMax {

    public static void main(String[] args) {
        int[] array = {18, 25, 7, 36, 13, 2, 89, 63};
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("max" + min);
        System.out.println("index" + index);
    }
}
