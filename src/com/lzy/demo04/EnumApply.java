package com.lzy.demo04;

public enum EnumApply {

    up, down, left, right;

    public static void main(String[] args) {
        EnumApply e = EnumApply.valueOf("up");
        switch (e) {
            case up:
                System.out.println("向上");
                break;
            case down:
                System.out.println("向下");
                break;
            case left:
                System.out.println("向左");
                break;
            case right:
                System.out.println("向右");
                break;
        }
    }
}
