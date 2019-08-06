package com.lzy.demo12;

import java.util.Random;
import java.util.Scanner;

public class testScnnner {
    public static void main(String[] args) {

        Random random = new Random();
        while (true) {
            int num = random.nextInt(900) + 100;
            System.out.println(num);
            if (num % 10 == 0) {
                break;
            }
        }

    }
}
