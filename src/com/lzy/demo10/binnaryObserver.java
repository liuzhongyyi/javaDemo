package com.lzy.demo10;

public class binnaryObserver extends observer {


    public binnaryObserver(sub sub) {
        super(sub);
    }

    @Override
    public void update() {
        System.out.println("观察者模式");
    }
}
