package com.lzy.demo16;

import java.util.Arrays;
import java.util.Random;

public class randomInt {

    public static void main(String[] args) {
        int[] num = creatNum();
        System.out.println(Arrays.toString(num));
    }

    public static int[] creatNum() {
        Random random = new Random();
        int[] number = new int[100];
        for (int x = 0; x < number.length; x++) {
            boolean bool = true;
            while (bool) {
                int ranNum = random.nextInt(1000 - 100 + 1);
                if (isNumRet(number, ranNum)) {
                    number[x] = ranNum;
                    bool = false;
                }
            }
        }
        Arrays.sort(number);
        return number;
    }

    public static boolean isNumRet(int[] arr, int numval) {
        for (int k = 0; k < arr.length; k++) {
            if (numval == arr[k]) {
                return false;
            }
        }
        return true;
    }

}
