package com.lzy.demo15;

import java.math.BigDecimal;

public class bigDecimer {
    public static void main(String[] args) {

        BigDecimal decimal = new BigDecimal(3.136);
        System.out.println(decimal.doubleValue()); // -->3.136
        BigDecimal scale = decimal.setScale(2, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(scale.doubleValue()); // 产生新对象对新对象有效 -->3.14


    }
}
