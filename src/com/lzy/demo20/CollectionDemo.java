package com.lzy.demo20;

import sun.awt.SunHints;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(5);
        list.add(6);
        swap(list);
        System.out.println(list);

    }

    static void swap(List<Integer> list) {

        for (int i = 0; i < list.size() / 2; i++) {

            Integer value1 = list.get(i);
            Integer value2 = list.get(list.size() - i - 1);
            list.set(list.size() - i - 1, value1);
            list.set(i, value2);

        }
    }

    static int totalCount(List<?> list, Object o) {

        HashMap<Object, Integer> hashMap = new HashMap<>();
        for (Map.Entry<Object, Integer> entry : hashMap.entrySet()) {
            if (entry.getKey() == o) {
                Integer value = entry.getValue();
                hashMap.put(entry.getKey(), ++value);

            }
        }
        return hashMap.get(o);

    }

    static void ReplaceValue(List<Integer> list, Integer oldValue, Integer newValue) {
        // list.stream().map((value)->{if(value==oldValue){return newValue;}return value;}).forEach(System.out::println);
        for (Object o : list) {
            if (o == oldValue) {
                int index = list.indexOf(o);
                list.set(index, newValue);
            }
        }
    }

}
