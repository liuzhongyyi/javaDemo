package com.lzy.demo16;

import java.util.concurrent.locks.Condition;

public class compareString {

    public static void main(String[] args) {
        boolean equal = isEqualWithOrder("Here you are", "is This nowcoder");
        System.out.println(equal);
    }


    /**
     * "This is nowcoder","is This nowcoder"
     * 返回：true
     * "Here you are","Are you here"
     * 返回：false
     *
     * @param str1
     * @param str2
     * @return
     */
    static boolean isEqualWithOrder(String str1, String str2) {
        int i = 0;
        int j = 0;
        int flag = 0;
        condition1:
        for (i = 0; i < str1.length(); i++) {
            Condition2:
            for (j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    flag = 1;
                    break Condition2;

                }


            }
            if (flag == 0) {
                return false;
            }


        }
        return true;
    }
}
