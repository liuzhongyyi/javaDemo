package com.lzy.demo11;

public class orderword {
    public static void main(String[] args) {
        char chars[] = {'a', 'c', 'u', 'b', 'e'};
        for (int j = 0; j < chars.length - 1; j++) {
            for (int i = chars.length - 1; i > j; i--) {
                if (chars[i - 1] > chars[i]) {
                    char temp = ' ';
                    temp = chars[i - 1];
                    chars[i - 1] = chars[i];
                    chars[i] = temp;
                }
            }

        }
        for (char aChar : chars) {
            System.out.println(aChar);
        }
    }

}
