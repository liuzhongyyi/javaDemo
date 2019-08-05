package com.lzy.demo07;

public class TestThread extends Thread {

    volatile static boolean stop = false;

    public static void main(String[] args) {


        TestThread thread = new TestThread();

        //开始启动线程
        System.out.println("开始启动线程");
        thread.start();
        //休眠当前线程

        //TestThread.stop = true;
        try {
            Thread.sleep(1000);
            System.out.println("开始进行打断处理");
            thread.interrupt();

        } catch (InterruptedException e) {
            System.out.println("-----------------------");
        }


        System.out.println("Mian方法结束");
    }


    @Override
    public void run() {

        while (!stop) {
            try {
                Thread.sleep(100);
                System.out.println("执行run方法");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("收到异常");
            }

        }

    }
}
