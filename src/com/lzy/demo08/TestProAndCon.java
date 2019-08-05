package com.lzy.demo08;

public class TestProAndCon {

    public static void main(String[] args) {
        ProductAndComsume productAndComsume = new ProductAndComsume();
        new Thread("p1") {

            @Override
            public void run() {
                while (true)
                    productAndComsume.product();
            }
        }.start();

        new Thread("p2") {
            @Override
            public void run() {
                while (true)
                    productAndComsume.product();
            }
        }.start();

        new Thread("c1") {
            @Override
            public void run() {
                productAndComsume.consume();
            }
        }.start();

        new Thread("c2") {
            @Override
            public void run() {
                productAndComsume.consume();
            }
        }.start();
    }
}
