package com.lzy.demo10;

public class testObser {

    public static void main(String[] args) {
        sub sub = new sub();
        new binnaryObserver(sub);
        sub.setState(100);
    }
}
