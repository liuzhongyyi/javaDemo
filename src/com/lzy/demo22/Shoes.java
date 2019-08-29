package com.lzy.demo22;

public interface Shoes {
    void doShoes();
}

class ShoesImpl implements Shoes {

    @Override
    public void doShoes() {
        System.out.println("做鞋");
    }
}

abstract class decorete {

}