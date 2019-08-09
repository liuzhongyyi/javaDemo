package com.lzy.demo15;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.print.SunMinMaxPage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class BigNumber {
    public static void main(String[] args) {
//        BigInteger integer = new BigInteger("2");
//        BigInteger max = integer.max(BigInteger.valueOf(3));
//        System.out.println(max);
//
//        BigInteger num1 = BigInteger.valueOf(4);
//        BigInteger num2 = BigInteger.valueOf(2);
//        System.out.println( num1.add(num2));
//        System.out.println(num1.subtract(num2));
//        System.out.println(num1.multiply(num2));
//        System.out.println(num1.divide(num2));
//        System.out.println(Arrays.toString(num1.divideAndRemainder(num2)));
//        BigInteger sum = getSum();
//        System.out.println(sum);
        BigInteger sum = getSumByOther(4);
        int signum = sum.signum();
        System.out.println(signum);
//        System.out.println(sum);


    }

    static BigInteger getSum() {
        BigInteger sum = BigInteger.valueOf(1);
        for (int i = 1; i <= 3; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));

        }
        return sum;
    }

    static BigInteger getSumByOther(int n) {

        if (BigInteger.valueOf(n) == BigInteger.valueOf(1)) {
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(n).multiply(getSumByOther(BigInteger.valueOf(n - 1).intValue()));

    }

}
