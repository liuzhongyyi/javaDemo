package com.lzy.demo24;

public abstract class Food {
    public void doOne() {
        System.out.println("do one");
    }

    public void doTwo() {
        System.out.println("do two");
    }

    public abstract void doEnd();

}

class SpicialiNiceFood extends Food {

    @Override
    public void doEnd() {
        System.out.println("SpicialiNiceFood");
    }
}

class VeryNiceFood extends Food {

    @Override
    public void doEnd() {
        System.out.println("VeryNiceFood");
    }
}

class badFood extends Food {

    @Override
    public void doEnd() {
        System.out.println(" badFood");
    }
}


class verBadFood extends Food {

    @Override
    public void doEnd() {
        System.out.println("verBadFood");
    }
}