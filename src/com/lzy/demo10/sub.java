package com.lzy.demo10;

import java.util.ArrayList;
import java.util.List;

public class sub {

    private List<observer> observers = new ArrayList<>();

    private int state;

    public void setState(int state) {
        if (state == this.state) {
            return;
        }
        this.state = state;
        notify_All();
    }

    public void attach(observer observer) {
        observers.add(observer);
    }

    public void notify_All() {
        for (observer observer : observers) {
            observer.update();
        }
    }
}
