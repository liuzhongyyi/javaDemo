package com.lzy.demo27;

public class ThreadExcetion {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("准备抛出异常");
            System.out.println(1 / 0);
        });
        t.setUncaughtExceptionHandler((thread, e) -> {
            System.out.println("aaaa");
            e.printStackTrace();
        });

        t.start();
    }


}
