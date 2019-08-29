package com.lzy.demo27;

public class VolatileTest {
    public final static int MAX_VALUE = 500;
    public static int INIT_VALUE = 0;

    public static void main(String[] args) {

        new Thread(() -> {
            int value = INIT_VALUE;
            while (value < MAX_VALUE) {
                if (value != INIT_VALUE) {
                    System.out.println("update to " + INIT_VALUE);
                }
                value = INIT_VALUE;
            }

        });
    }
}
