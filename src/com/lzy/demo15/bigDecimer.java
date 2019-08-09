package com.lzy.demo15;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class bigDecimer {
    public static void main(String[] args) {
//
//        BigDecimal decimal = new BigDecimal(3.136);
//        System.out.println(decimal.doubleValue()); // -->3.136
//        BigDecimal scale = decimal.setScale(2, BigDecimal.ROUND_HALF_DOWN);
//        System.out.println(scale.doubleValue()); // 产生新对象对新对象有效 -->3.14
//        System.out.println(decimal == scale);
        double num = Math.PI;
//        DecimalFormat decimalFormat = new DecimalFormat("00.0");
//        System.out.println(decimalFormat.format(num));
//        decimalFormat.applyPattern("00.00");
//        System.out.println(decimalFormat.format(num));
//        decimalFormat.applyPattern("00.000");
//        System.out.println(decimalFormat.format(num));
//
//
//        DecimalFormat decimalFormat1 = new DecimalFormat("##.#");
//        System.out.println(decimalFormat1.format(num));
//        decimalFormat1.applyPattern("##.##");
//        System.out.println(decimalFormat1.format(num));
//        decimalFormat1.applyPattern("##.###");
////        System.out.println(decimalFormat1.format(num));
//        DecimalFormat format = new DecimalFormat();
//        format.applyPattern("#.##%");
//        //3.1416
//        String format1 = format.format(num);
//        System.out.println(format1);
        long c = 299792458;
        DecimalFormat decimalFormat1 = new DecimalFormat(",###");
        System.out.println(decimalFormat1.format(c));



    }
}
