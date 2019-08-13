package com.lzy.demo17;

import java.util.*;

public class randomNum {

    public static void main(String[] args) {
//        int needNum = 20;
//        int currentNum = 0;
//        Random random = new Random();
//        List<Integer> list = new ArrayList<>();
//        while (currentNum<needNum)
//        {
//            //random.nextInt(n-m+1)+m 1-99
//            int value =random.nextInt(99)+1;
//            if(!list.contains(value)&&value%2==0)
//            {
//                list.add(value);
//                currentNum++;
//            }
//        }
//        System.out.println(list.size());
//        System.out.println(list);
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        list1.add('a');
        list1.add('b');
        list1.add('c');
        list1.add('d');
        list1.add('e');
        list2.add('c');
        list2.add('e');
        list2.add('d');
        list2.add('g');
        list2.add('h');
        Collection collection = mergeCollections(list1, list2);
        System.out.println(collection);


    }

    static Collection mergeCollections(Collection c1, Collection c2) {
        Collection temp1 = new ArrayList();
        Collection temp2 = new ArrayList();
        //获取c1
        temp1.addAll(c1);
        System.out.println("c1" + c1);
        //获取c2
        temp2.addAll(c2);
        System.out.println("c2" + c2);
        //找到合集
        temp1.retainAll(temp2);
        System.out.println("temp1" + temp1);
        //从temp2中剔除合集
        temp2.removeAll(temp1);
        //合并c1c2
        c1.addAll(temp2);
        return c1;

    }
}
