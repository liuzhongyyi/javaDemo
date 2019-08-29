package com.lzy.demo21;

public class deadLockDemo {
    public static void main(String[] args) {
        threadService1 threadService1 = new threadService1();
        threadService2 threadService2 = new threadService2();
        threadService1.setThreadService2(threadService2);
        threadService2.setThreadService1(threadService1);
        Thread t1 = new Thread(() -> {
            threadService1.Service1_m();
        });
        Thread t2 = new Thread(() -> {
            threadService2.Service2_m();
        });
        t1.start();
        t2.start();


    }
}
