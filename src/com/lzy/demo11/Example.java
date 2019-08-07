package com.lzy.demo11;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        int days = 0;
        int d = 0;
        Example example = new Example();
        System.out.print("请输入当前年份：");
        int year = example.input();
        System.out.print("请输入当前的月份：");
        int month = example.input();
        System.out.print("请输入当月的第几天：");
        int day = example.input();

        if (year < 0 || month < 0 || month > 12 || day < 0 || day > 31) {
            System.out.println("Input error,please run this program again!");
            System.exit(0);
        }

        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
            }
            d += days;

        }
        System.out.println(year + "年" + month + "月" + day + "日 是当年的第" + (d + day) + "天。");
    }

    public int input() {
        int value = 0;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();
        return value;
    }

}
