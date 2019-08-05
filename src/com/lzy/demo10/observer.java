package com.lzy.demo10;

public abstract class observer {

    protected sub sub;

    public observer(sub sub) {
        this.sub = sub;
        this.sub.attach(this);
    }

    public abstract void update();
}
