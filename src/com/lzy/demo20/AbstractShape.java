package com.lzy.demo20;

public abstract class AbstractShape {

    abstract public double getArea();

    abstract public double getPerSum();
}

class Rectangular extends AbstractShape {

    private double lenght;
    private double width;


    @Override
    public double getArea() {
        return lenght * width;
    }

    @Override
    public double getPerSum() {
        return 2 * (lenght + width);
    }
}

class square extends AbstractShape {
    private double length;

    @Override
    public double getArea() {
        return length * 4;
    }

    @Override
    public double getPerSum() {
        return length * length;
    }
}

class circular extends AbstractShape {
    private double r;

    @Override
    public double getArea() {
        return Math.PI * 2 * r;
    }

    @Override
    public double getPerSum() {
        return Math.PI * r * r;
    }
}