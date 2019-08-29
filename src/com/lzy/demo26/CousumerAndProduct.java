package com.lzy.demo26;

import java.util.concurrent.locks.Lock;

public class CousumerAndProduct {
    public static Object Lock = new Object();
    public static int i = 0;

    public static void main(String[] args) {
        CousumerAndProduct cousumerAndProduct = new CousumerAndProduct();
        Thread comsumer = new Thread(() -> {
            while (true) {
                cousumerAndProduct.comsumer();
            }
        });


        Thread product = new Thread(() -> {
            while (true) {
                cousumerAndProduct.product();
            }
        });
        comsumer.start();
        product.start();
    }

    public void product() {
        synchronized (Lock) {
            System.out.println("生产者" + i++);
        }
    }

    public void comsumer() {
        synchronized (Lock) {
            System.out.println("消费者" + i++);
        }
    }

}
