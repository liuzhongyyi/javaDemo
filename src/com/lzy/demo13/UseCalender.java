package com.lzy.demo13;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import static java.lang.reflect.Array.set;

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
        Calendar instance = Calendar.getInstance();
        instance.set(2019, 8, 1);
        Calendar instance1 = Calendar.getInstance();
        instance1.set(2019, 8, 3);
        double day = getDistanceDay(instance, instance1);
        System.out.println(day);

    }

    static double getDistanceDay(Calendar calendar, Calendar calendar1) {
        long time1 = calendar.getTimeInMillis();
        long time2 = calendar1.getTimeInMillis();
        double floor = Math.floor((time2 - time1) / 1000 / 60 / 60 / 24);
        return floor;
    }

}
