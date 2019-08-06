package com.lzy.demo11;

import java.util.HashMap;
import java.util.Map;


public class getNumberCount {


    public static void main(String[] args) {
        String Text = "1239586838923173478943890234092";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars = Text.toCharArray();
        for (char c : chars) {
            if (hashMap.containsKey(c)) {
                Integer num = hashMap.get(c);
                hashMap.put(c, ++num);
            } else {
                hashMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : hashMap.entrySet()) {
            Character key = characterIntegerEntry.getKey();
            Integer value = characterIntegerEntry.getValue();
            System.out.println(key + "  " + value);
        }
    }

}
