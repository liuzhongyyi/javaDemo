package com.lzy.demo25;

public class TestDirector {
    public static void main(String[] args) {
        Director director = new Director(new SpeciBuild());
        director.build();
    }

}
