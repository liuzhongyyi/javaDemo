package com.lzy.demo25;

public class SpeciBuild extends Builder {
    private House house = new House();

    @Override
    public void Start() {
        System.out.println("special ");
    }

    @Override
    public void bullding() {
        System.out.println("special ");
    }

    @Override
    public void end() {
        System.out.println("special ");
    }

    @Override
    public House getResult() {
        Start();
        bullding();
        end();
        return house;
    }
}
