package com.lzy.demo14;

public class time {
    public static void main(String[] args) {

        getTime(100);
    }

    static void getTime(long second) {
        long seconds = second % 60;
        long minutes = second / 60 % 60;
        long hours = second / 60 / 60 % 24;
        System.out.println(hours + "时" + minutes + "分" + seconds + "秒");
    }

}
