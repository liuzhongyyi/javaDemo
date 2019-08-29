package com.lzy.demo22;

interface vga {
    void applyInfoBySpeciFormat();
}

interface target {
    void typec();

    void typecTovga();
}

public class AdapterDesignPartern {

}

class Applephone {
    public void transmitInfo() {
        System.out.println("传输数据");
    }

}

class typecTovga extends Applephone implements vga {

    @Override
    public void applyInfoBySpeciFormat() {
        transmitInfo();
        System.out.println("type c -tranformitTovag");
    }
}

class typecTovga2 implements vga {

    private Applephone applephone;

    @Override
    public void applyInfoBySpeciFormat() {
        applephone.transmitInfo();
        System.out.println("type c -tranformitTovag");


    }
}

abstract class Adapter implements target {
    @Override
    public void typec() {

    }

    @Override
    public void typecTovga() {

    }
}

class vgaAdapter extends Adapter {
    @Override
    public void typec() {
        System.out.println("type c -tranformitTovag");
    }

    @Override
    public void typecTovga() {
        System.out.println("转换为vga");
    }
}