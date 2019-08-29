package com.lzy.demo20;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        test1 test1 = new test1();

        Thread t1 = new Thread(() -> {
            test1.testLock();
        });
        t1.start();
        Thread t2 = new Thread(() -> test1.testLock());
        t2.start();
        t1.join();
        t2.join();

    }

}

class test1 {
    public synchronized void testLock() {
        // synchronized (this)
        {
            System.out.println("wo lai l ");

            try {
                Thread.sleep(100000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
