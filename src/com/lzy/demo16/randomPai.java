package com.lzy.demo16;

import com.sun.org.apache.bcel.internal.generic.NEW;
import jdk.nashorn.internal.ir.WhileNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;


public class randomPai {
    public static void main(String[] args) {
        String[] str = new String[]{"♥", "♠", "♣", "〇"};
        String[] str2 = new String[]{"A", "J", "Q", "K", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int crrentNum = 0;
        int realNum = 52;
        Random random = new Random();
        ArrayList<String> newList = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++)
            for (int j = 0; j < str2.length; j++) {
                list.add(str[i] + str2[j]);
            }
        while (crrentNum < realNum) {
            int value = random.nextInt(53);
            if (!newList.contains(value)) {
                newList.add(list.get(value));
                crrentNum++;
            }
        }


    }


}
