package com.lzy.demo26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class CapetureData {
    public static LinkedList<work> list = new LinkedList();

    public static int Max_NUM = 5;


    public static void main(String[] args) {
        ArrayList<Thread> list1 = new ArrayList<>();
        Arrays.asList("t1", "m1", "t2", "m2", "t3", "m3").stream().map(CapetureData::createThread).forEach(
                (thread) -> {
                    thread.start();
                    list1.add(thread);

                }

        );
        list1.forEach((t) -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    public static Thread createThread(String name) {
        return new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "准备收集数据");
            synchronized (list) {
                while (list.size() > Max_NUM) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.add(new work());
            }
            System.out.println(Thread.currentThread().getName() + "采集数据中");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "采集数据完成");
            synchronized (list) {
                list.removeFirst();
                list.notifyAll();
            }
        });
    }

    static class work {

    }
}

