package com.lzy.demo18;


import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.sun.org.apache.xpath.internal.operations.String;

import java.util.*;

public class radomNum {
    public static void main(String[] args) {
//        Random random = new Random();
//        ArrayList list = new ArrayList();
//        int[] ints = new int[10];
//        for(int i = 0 ; i<10 ; i++)
//        {
//            int value =random.nextInt(100)+1;
//            ints[i]=value;
//
//        }
//        for (int i = 0; i <ints.length ; i++) {
//            if(ints[i]>10){
//                list.add(ints[i]);
//            }
//        }
//        String s = list.toString();
//        System.out.println(s);
        TreeSet<Object> objects = new TreeSet();
        objects.add(1);
        objects.add("2");

    }

    static int getIndex(List list, int value) {

        return list.indexOf(value);

    }

    static void printList(String[] array) {
        LinkedList list = new LinkedList<String>();

        for (int i = 0; i < array.length; i++) {
            if (!list.contains(array[i])) {
                list.add(array[i]);
            }
        }
        for (Object o : list) {
            System.out.println((String) o);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
