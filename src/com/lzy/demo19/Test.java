package com.lzy.demo19;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] strs = new String[]{};
        Stream<String> stringStream = Stream.of(strs);
        List<String> asList = stringStream.collect(ArrayList::new, ArrayList::add,
                ArrayList::addAll);

    }
}
