package com.lzy.demo13;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class UseCalender {
    public static void main(String[] args) {

//        Calendar calendar = Calendar.getInstance();
//        Date time = calendar.getTime();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
//        simpleDateFormat.applyPattern("yyyy-MM-dd hh:mm:ss :SSS");
//        String s = simpleDateFormat.format(time);
//        System.out.println(s);
//        calendar.add(Calendar.HOUR_OF_DAY,3);
//        System.out.println(calendar.getTime());
//        calendar.add(Calendar.DAY_OF_YEAR,-7);
//        System.out.println(calendar.getTime());
//        Calendar instance = Calendar.getInstance();
//        instance.set(2019, 8, 1);
//        Calendar instance1 = Calendar.getInstance();
//        instance1.set(2019, 8, 3);
//        double day = getDistanceDay(instance, instance1);
//        System.out.println(day);
//        Random random = new Random(12L);
//        int anInt = random.nextInt(10);
//        Random random1 = new Random(12L);
//        int i = random1.nextInt(20);
//        System.out.println(anInt+" "+i);
//        System.nanoTime();

        randomByteNum();



    }

    static double getDistanceDay(Calendar calendar, Calendar calendar1) {
        long time1 = calendar.getTimeInMillis();
        long time2 = calendar1.getTimeInMillis();
        double floor = Math.floor((time2 - time1) / 1000 / 60 / 60 / 24);
        return floor;

    }

    static void randomByteNum() {
        byte[] bytes = new byte[10];
        Random random = new Random();
        random.nextBytes(bytes);
        System.out.println(Arrays.toString(bytes));
    }
}
