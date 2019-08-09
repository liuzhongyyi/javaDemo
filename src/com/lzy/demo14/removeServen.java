package com.lzy.demo14;


public class removeServen {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 7 != 0 && i != 0 && !String.valueOf(i).contains("7")) {
                System.out.println(i);
            }
        }

    }

}
