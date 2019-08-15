package com.lzy.demo18;

import org.apache.commons.dbutils.QueryLoader;
import org.apache.commons.dbutils.QueryRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;

public class compareByMyself {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        while (count < 100) {
            Random random = new Random();
            list.add(random.nextInt(100));
            count++;
        }
        list.sort((o1, o2) ->
                o1 == o2 ? 0 : o1 > o2 ? 1 : 0
        );
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        QueryRunner runner = new QueryRunner();
    }
}
