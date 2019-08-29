package com.lzy.demo20;

public class templetePattern {

}

abstract class hostTempelet {
    public final void builderHorse() {
        moveBrick();
        doOther1();
        doOther2();
        finshed();
    }

    public void moveBrick() {

        System.out.println("start movebrick");
    }

    abstract public void doOther1();

    abstract public void doOther2();

    public void finshed() {
        System.out.println("the house finshed");
    }

}

class woodHouse extends hostTempelet {
    private woodHouse woodHouse = new woodHouse();

    public woodHouse() {
        super();
    }

    @Override
    public void doOther1() {
        System.out.println("wood house do one thing");
    }

    @Override
    public void doOther2() {
        System.out.println("wood house do two thing");
    }
}
