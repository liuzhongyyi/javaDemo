package com.lzy.demo17;


import com.sun.org.apache.regexp.internal.RE;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class getDayOfMonth {
    public static void main(String[] args) {
//        String s = getLastDayOfMonth(2018, 9);
//        System.out.println(s);
//        Calendar caleander = Calendar.getInstance();
//        caleander.add(Calendar.DATE,-1);
//        SimpleDateFormat format = new SimpleDateFormat();
//        format.applyPattern("yyyy-MM-dd");
//        String s = format.format(caleander.getTime());

//        Date date = new Date();
//        long time = date.getTime();
//        long finaTime = time-(24*60*60*1000);
//        Date date1 = new Date(finaTime);
//        SimpleDateFormat format = new SimpleDateFormat();
//        format.applyPattern("yyyy-MM-dd mm:ss");
//        System.out.println(format.format(date1));

        test3();

    }


    static void test3() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy-MM-dd");
        String s = format.format(calendar.getTime());
        System.out.println(s);
    }

    static void test2(int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy-MM-dd");
        String s = format.format(calendar.getTime());
        System.out.println(s);


    }

    static void test1() {

        Calendar calendar = Calendar.getInstance();
        int maximum = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, maximum);
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy-MM-dd");
        String s = format.format(calendar.getTime());
        System.out.println(s);
    }


    static String getLastDayOfMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        int maximumDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, maximumDay);
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy-MM-dd");
        String s = format.format(calendar.getTime());
        return s;

    }


    static int[] reverse(int[] array) {
        int tmep = 0;
        for (int i = 0; i < array.length / 2; i++) {
            tmep = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmep;

        }
        return array;
    }

    public static int[] reverse3(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        int[] ints = new int[array.length];
        for (int k = array.length, j = 0; k > 0; k--, j++) {
            ints[j] = array[k];
        }
        return ints;
    }


}
