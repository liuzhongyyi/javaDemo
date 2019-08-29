package com.lzy.demo25;

public class commonBuilder extends Builder {

    private House house = new House();

    @Override
    public void Start() {
        System.out.println("common start");

    }

    @Override
    public void bullding() {
        System.out.println("common building");
    }

    @Override
    public void end() {
        System.out.println("common  end");
    }

    @Override
    public House getResult() {
        Start();
        bullding();
        end();

        return house;
    }
}
