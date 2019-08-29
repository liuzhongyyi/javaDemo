package com.lzy.demo19;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class getSameElemrntDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>(Comparator.comparingInt(String::length));
        treeSet.add("sss");
        treeSet.add("ss");
        treeSet.add("sssssss");
        treeSet.add("ssss");
        treeSet.add("");

        treeSet.stream().collect(ArrayList::new, (list, value) -> list.add(value), (list1, list2) -> list1.addAll(list2));


//        String lengthElement = getMaxLengthElement(treeSet);
//        System.out.println(lengthElement);

    }

    static String getMaxLengthElement(Set<String> set) {
        Comparator t = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.length() > o2.length() ? 1 : 0;
            }
        };
        String max = "";
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (t.compare(max, s) > 0) {
                max = s;
            }
        }

        return max;
        //String s = Collections.max(set);
        //return  s;
    }

    static List<?> transforSetToList(Set<?> set) {
        ArrayList<?> list = new ArrayList<>(set);
        return list;
    }

    public List getSameElemrnt(int[] num1, int[] num2) {
        List<int[]> list = Arrays.asList(num1);
        List<int[]> list1 = Arrays.asList(num2);
        List newList = new ArrayList();
        newList.addAll(list1);
        newList.retainAll(list1);
        return newList;
    }

    public String getMaxElement(Set<String> set) {
        String max = Collections.max(set);
        return max;
    }

}
