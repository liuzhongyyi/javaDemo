package com.lzy.demo19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class GenericParadigm {
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        list.add(1);
        List<? super Number> list1 = new ArrayList<>();
        Iterator<? super Number> iterator = list1.iterator();


    }
}
