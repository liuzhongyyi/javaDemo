package com.lzy.demo19;

import com.sun.org.apache.regexp.internal.RE;
import sun.reflect.generics.tree.Tree;

import java.util.*;
import java.util.function.Predicate;

interface Clothes {
    public void doClother();
}

class ClothesImpl implements Clothes {

    @Override
    public void doClother() {
        System.out.println("做衣服");
    }
}

class decorate implements Clothes {
    private Clothes clothes;

    public decorate(Clothes clothes) {
        this.clothes = clothes;
    }

    @Override
    public void doClother() {
        clothes.doClother();
    }
}

class mydecorate extends decorate {

    public mydecorate(Clothes clothes) {
        super(clothes);
    }


    @Override
    public void doClother() {
        super.doClother();
        System.out.println("使用装饰器");
    }
}

class mydecorate1 extends decorate {

    public mydecorate1(Clothes clothes) {
        super(clothes);
    }


    @Override
    public void doClother() {
        super.doClother();
        System.out.println("使用装饰器1");
    }
}

public class decorateTest {
    public static void main(String[] args) {
//        int[] array =new int[]{1,2,3,4,5,6,7,8,9};
//        List list = getSpecifyNum(array, value -> value > 5&&value!=6);
//        System.out.println(list);
        ClothesImpl clothes = new ClothesImpl();
        mydecorate1 mydecorate = new mydecorate1(new mydecorate(clothes));
        mydecorate.doClother();

    }

    public static List getSpecifyNum(int[] array, Predicate<Integer> predicate) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (predicate.test(array[i])) {
                list.add(array[i]);
            }
        }
        return list;

    }


}
