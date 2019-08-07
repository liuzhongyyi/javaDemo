package com.lzy.demo11;

import java.util.Random;

public class Verficationcode {
    final static String CODE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXWZabcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(62);
            stringBuilder.append(CODE.charAt(index));
        }
        System.out.println(stringBuilder);

    }

}

