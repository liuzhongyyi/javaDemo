package com.lzy.demo03;

import org.junit.Test;

public class Stringapply {

    @Test
    public void operateString() {
        String s =
                "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way. In short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only.";
        String[] s1 = s.split(" ");
        for (String s2 : s1) {
            if (s2.endsWith(",") || s2.endsWith(".")) {
                s2 = s2.replace(s2.charAt(s2.length() - 1) + "", "");


            }
            System.out.println(s2);

        }
        System.out.println(s.length());
    }
}
