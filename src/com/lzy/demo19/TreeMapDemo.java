package com.lzy.demo19;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
//        TreeMap<String, Integer> map = new TreeMap<>();
//        map.put("zs",12);
//        map.put("ls",21);
//        map.put("w5",18);
//        map.put("zl",99);
//        sortStudent(map);
        Hashtable hashtable = new Hashtable();
        hashtable.put(null, 1);


    }

    static List mapToSet(Map<String, Integer> map) {
        ArrayList<String> list = new ArrayList<String>(map.keySet());
        return list;

    }

    static void sortStudent(Map<String, Integer> map) {
        Comparator<Map.Entry<String, Integer>> comparator = (socre1, socre2) -> socre1.getValue() - socre2.getValue();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        ArrayList<Map.Entry<String, Integer>> integers = new ArrayList<>(entries);
        Collections.sort(integers, comparator);
        integers.forEach((value) -> {
            System.out.println(value);
        });
    }

}

