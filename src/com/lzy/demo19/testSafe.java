package com.lzy.demo19;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testSafe {

    //static  final List<Integer> integers = Collections.synchronizedList(new ArrayList<Integer>());
    static Integer num = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            num++;
        }).start();

    }
}
