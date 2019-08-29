package com.lzy.demo20;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;

import java.util.*;


public class ReverseDemo {

    /**
     * 题目3
     *
     * @param list
     * @return
     */
    static List<String> reverse(List<String> list) {
        Collections.reverse(list);
        return list;
    }

    /**
     * 题目四
     *
     * @param works
     * @param work
     */
    static void operatorWorkList(LinkedList<Work> works, Work work) {
        works.add(findIndex(works, "li4") - 1, work);
        works.remove(findIndex(works, "wang5"));
        for (Work work1 : works) {
            System.out.println(work1);
        }
        ListIterator<Work> iterator = works.listIterator();
        while (iterator.hasNext()) {
            iterator.next().work();
        }

    }

    /**
     * 题目六
     */

    static void getSorce() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>();
        list.sort((value, value2) -> value2.getValue() - value.getValue());
        list.stream().limit(3).forEach(System.out::println);

    }

    static int findIndex(List<Work> list, String str) {
        for (Work work : list) {
            if (work.getName().equals(str)) {
                int index = list.indexOf(work);
                return index;
            }
        }
        return -1;
    }

    /**
     * 题目五
     */
    static void printColection() {
        Set<Integer> hashSet = new HashSet<>();
        while (true) {
            hashSet.add(new Random().nextInt(101) + 100);
            if (hashSet.size() == 10) {
                break;
            }
        }
        ArrayList<Integer> list = new ArrayList<>(hashSet);
        list.stream().sorted(Comparator.comparingInt(Integer::intValue)).forEach(System.out::println);

    }

    /**
     * 题目七
     *
     * @param map
     */
    static void printMap(Map<String, Integer> map) {
        map.put("张三", 2600);
        map.forEach((key, value) -> {
            map.put(key, value + 100);
        });
        map.forEach((key, value) ->
                System.out.println(key)
        );
        map.forEach((key, value) ->
                System.out.println(value)
        );

    }


}

@ToString
@Setter
@Getter
class Work {
    private int age;
    private String name;
    private double salary;

    public void work() {
        System.out.println(this + "调用了work方法");
    }
}

