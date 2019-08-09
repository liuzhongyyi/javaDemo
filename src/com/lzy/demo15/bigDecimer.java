package com.lzy.demo15;

import java.math.BigDecimal;

public class bigDecimer {
    public static void main(String[] args) {

        BigDecimal decimal = new BigDecimal("3.14159");
        BigDecimal decimal1 = decimal.setScale(2, BigDecimal.ROUND_UP);
        System.out.println(decimal1);
        System.out.println("aaa");
    }
}
