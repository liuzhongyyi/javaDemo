package com.lzy.demo27;

public class ThreadGroupAPI {

    public static void main(String[] args) throws Exception {
        ThreadGroup threadGroup1 = new ThreadGroup("tg1");
        Thread t1 = new Thread(threadGroup1, () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(threadGroup1, () -> {
        });
        Thread t3 = new Thread(threadGroup1, () -> {
        });
        t1.setPriority(Thread.MAX_PRIORITY);
        int maxPriority = threadGroup1.getMaxPriority();
        System.out.println(maxPriority);
        boolean destroyed = threadGroup1.isDestroyed();
        System.out.println(destroyed);
        threadGroup1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        boolean destroyed1 = threadGroup1.isDestroyed();
        System.out.println(destroyed1);

//
//        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
//        System.out.println(threadGroup.getName());
//        System.out.println(threadGroup.getParent().getName());
//        System.out.println(threadGroup.getParent().getParent());
    }
}
