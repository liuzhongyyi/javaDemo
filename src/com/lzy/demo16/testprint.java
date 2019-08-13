package com.lzy.demo16;

import java.util.ArrayList;
import java.util.Scanner;

public class testprint {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.next();
            if (s.equals("y") || s.equals("Y")) {
                break;
            }
            Integer value = Integer.valueOf(s);
            list.add(value);

        }
        System.out.println(list);

    }

}
