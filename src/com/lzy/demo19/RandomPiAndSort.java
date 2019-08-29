package com.lzy.demo19;

import com.sun.javafx.collections.MappingChange;

import java.sql.SQLOutput;
import java.util.*;

public class RandomPiAndSort {
    static final int Need_Value = 54;
    static final int PaiOfEveryPai = 17;
    static final int LandlordOfPaiNum = 14;
    static String[] str = new String[]{"♥", "♠", "♣", "〇"};
    static String[] str2 = new String[]{"A", "J", "Q", "K", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    static TreeMap<String, String> hashMap = new TreeMap<String, String>();
    private static String Spical_Value = "王";

    public static void compose() {
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                hashMap.put(str[i], str2[j]);
            }
        }
        hashMap.put("大", Spical_Value);
        hashMap.put("小", Spical_Value);
    }

    public static List<Map.Entry<String, String>> shuffleCards() {
        ArrayList<Map.Entry<String, String>> list = new ArrayList<>();
        int count = 0;
        while (count < Need_Value) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                if (!list.contains(entry)) {
                    list.add(entry);
                    count++;
                }
            }
        }
        return list;
    }

    public static int chooseLandlord() {
        return new Random().nextInt(3) + 1;
    }

    public static List<Map.Entry<String, String>> getPai(List<Map.Entry<String, String>> list, List<Map.Entry<String, String>> play, int value) {
        int count = 0;
        while (count < value) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                if (!list.contains(entry)) {
                    play.add(entry);
                    count++;
                }
            }
            list.retainAll(play);
        }
        return play;
    }


    public static void dealCards(List<Map.Entry<String, String>> list, List<Map.Entry<String, String>> play1, List<Map.Entry<String, String>> play2, List<Map.Entry<String, String>> play3) {
        int landlord = chooseLandlord();
        for (int i = 0; i < list.size() - 3; i++) {
            if ("1".equals(String.valueOf(landlord))) {
                play1.add(list.get(list.size()));
                play1.add(list.get(list.size() - 1));
                play1.add(list.get(list.size() - 2));
                getPai(list, play1, LandlordOfPaiNum);
                getPai(list, play2, PaiOfEveryPai);
                getPai(list, play3, PaiOfEveryPai);

            } else if ("2".equals(String.valueOf(landlord))) {
                play2.add(list.get(list.size()));
                play2.add(list.get(list.size() - 1));
                play2.add(list.get(list.size() - 2));
                getPai(list, play2, LandlordOfPaiNum);
                getPai(list, play1, PaiOfEveryPai);
                getPai(list, play3, PaiOfEveryPai);

            } else {
                play3.add(list.get(list.size()));
                play3.add(list.get(list.size() - 1));
                play3.add(list.get(list.size() - 2));
                getPai(list, play3, LandlordOfPaiNum);
                getPai(list, play1, PaiOfEveryPai);
                getPai(list, play2, PaiOfEveryPai);
            }
        }
        System.out.println(play1);
        System.out.println(play2);
        System.out.println(play3);

    }

    public static void main(String[] args) {
        compose();
        List<Map.Entry<String, String>> list = shuffleCards();
        ArrayList<Map.Entry<String, String>> play1 = new ArrayList<>();
        ArrayList<Map.Entry<String, String>> play2 = new ArrayList<>();
        ArrayList<Map.Entry<String, String>> play3 = new ArrayList<>();
        dealCards(list, play1, play2, play3);
        System.out.print("");
    }
}
