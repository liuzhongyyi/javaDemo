package com.lzy.demo16;

import java.awt.List;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Collectiondemo {

//    public static void main(String[] args) {
//
//        ArrayList<Object> list = new ArrayList<>();
//        list.add(1);
//        list.add(20);
//        list.add(3);
//        for (Object o : list) {
//            System.out.println(o);
//
//        }
//
//        Iterator<Object> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//
//
//    }

    public static void main(String[] args) {
        Random random = new Random();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new Runnable() {
            @Override
            public void run() {

            }
        });

    }


}





