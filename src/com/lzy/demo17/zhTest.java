package com.lzy.demo17;

import java.util.Arrays;
import java.util.Random;

public class zhTest {
    public static void main(String[] args) {
        int[] ints = numArray(400);
        String s = Arrays.toString(ints);
        System.out.println(s);

    }

    public static int[] numArray(int size) {
        Random random = new Random();
        int[] ints = new int[size];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (random.nextInt(901) + 100);
            for (int j = 0; j < i; j++) {
                if (ints[i] == ints[j]) {
                    i--;
                }
            }
        }
        return ints;
    }

    public static int[] num(int[] score, int[] arrays) {
        Random random = new Random();
        int range = arrays.length;
        for (int i = 0; i < range; i++) {
            int indexPose = random.nextInt(range);
            arrays[i] = score[indexPose];
            for (int j = indexPose; j < score.length; j++) {
                score[j] = score[j + 1];
            }
            range--;
        }
        return score;
    }


}
