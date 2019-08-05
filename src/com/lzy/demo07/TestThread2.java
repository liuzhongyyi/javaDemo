package com.lzy.demo07;

public class TestThread2 extends Thread {

    public static void main(String[] args) throws InterruptedException {

        new TestThread2().start();
        Thread.sleep(5000);
        System.out.println("main方法");

    }


    @Override
    public void run() {
        try {
            System.out.println("线程一");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
