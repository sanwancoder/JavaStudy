package com.wyfdc.go.leetcode.interview.qml;

import java.util.Objects;

/**
 * 1. 有一串字符串String s = "ababab",
 * 这个字符串可以看做由3个"ab"构成,即n=3, L = "ab", s = nL.
 * 现在要求编写一段程序,使用单例模式,输入任意字符串s,输出nL.
 * 如输入: aaaaa 输出 5a ,输入: ababa 输出: 1ababa
 */
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
