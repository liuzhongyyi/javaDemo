package com.lzy.demo26;

public class CousumerAndProduct2 {
    public static Object Lock = new Object();
    public static int i = 0;
    private volatile boolean isProduct = false;

    public static void main(String[] args) {
        CousumerAndProduct2 cousumerAndProduct = new CousumerAndProduct2();
        Thread comsumer = new Thread(() -> {
            while (true) {
                cousumerAndProduct.comsumer();
            }
        });
        Thread comsumer1 = new Thread(() -> {
            while (true) {
                cousumerAndProduct.comsumer();
            }
        });

        Thread product = new Thread(() -> {
            while (true) {
                cousumerAndProduct.product();
            }
        });
        Thread product2 = new Thread(() -> {
            while (true) {
                cousumerAndProduct.product();
            }
        });
        product.start();
        product2.start();
        comsumer.start();
        comsumer1.start();

    }

    public void product() {
        synchronized (Lock) {
            while (isProduct) {
                try {
                    Lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread() + "生产了" + ++i);
            Lock.notifyAll();
            isProduct = true;
        }
    }

    public void comsumer() {
        synchronized (Lock) {
            while (!isProduct) {
                try {
                    Lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread() + "消费了" + i);
            Lock.notifyAll();
            isProduct = false;

        }
    }

}
