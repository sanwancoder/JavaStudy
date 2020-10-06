package com.wyfdc.go.leetcode.interview.qml;

import java.util.Objects;

public class StringCount3 {

    private static StringCount3 tool = new StringCount3();

    private StringCount3() {
    }

    public static StringCount3 getStringCount3() {
        return tool;
    }

    public static String compress(String s) {
        if (Objects.isNull(s) || s.contains(" ")) {
            return "";
        }
        String result = "";
        int length = s.length();
        int count = 0;
        for (int i = 1; i <= length; i++) {
            String[] strings1 = s.split(s.substring(0, i));
            if (strings1.length == 0) {
                count = i;
                break;
            }
        }
        result = length / count + s.substring(0, count);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(StringCount3.compress("aaaaa"));
        System.out.println(StringCount3.compress("ababab"));
        System.out.println(StringCount3.compress("ababa"));
    }


}
