package com.lzy.demo08;

public class ProductAndComsume {

    private final Object lock = new Object();
    private boolean isProduct = false;
    private int i = 0;


    public void product() {

        synchronized (lock) {

            //1判断消费是否消费完
            if (isProduct) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + "生产者生产" + ++i);
                lock.notify();
                isProduct = true;

            }
        }
    }


    public void consume() {

        synchronized (lock) {
            //正在生产
            if (!isProduct) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //开始消费
            } else {
                System.out.println(Thread.currentThread().getName() + "消费者消费" + i);
                lock.notify();
                isProduct = false;

            }
        }
    }


}
