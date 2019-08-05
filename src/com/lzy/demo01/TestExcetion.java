package com.lzy.demo01;

public class TestExcetion {

    public static void main(String[] args) {
        new TestExcetion().fun();
    }

    void fun() {
        throw new CrackException();
    }
}
