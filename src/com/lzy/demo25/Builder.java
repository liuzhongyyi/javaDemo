package com.lzy.demo25;

public abstract class Builder {
    private House house = new House();

    public abstract void Start();

    public abstract void bullding();

    public abstract void end();

    public abstract House getResult();

}


