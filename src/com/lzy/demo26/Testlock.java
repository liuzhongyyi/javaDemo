package com.lzy.demo26;

import java.util.Optional;
import java.util.stream.Stream;

public class Testlock {
    public static void main(String[] args) {
        final BooleanLock booleanLock = new BooleanLock();
        Stream.of("T1", "T2", "T3", "T4").forEach((name) -> {
            new Thread(() -> {

                booleanLock.lock();
                System.out.println(Thread.currentThread().getName() + "获得了锁");
                try {
                    System.out.println(Thread.currentThread().getName() + "开始工作");
                    work();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println(Thread.currentThread().getName() + "开始解锁");
                    booleanLock.unlock();

                }

            }).start();
        });
    }

    private static void work() throws InterruptedException {
        Optional.of(Thread.currentThread().getName() + " is Working...")
                .ifPresent(System.out::println);
        Thread.sleep(40_000);
    }
}


