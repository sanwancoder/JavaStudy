package com.wyfdc.go.leetcode;

import java.util.Objects;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid(""));
        System.out.println(isValid("()"));
        System.out.println(isValid("("));
        System.out.println(isValid("]()"));
        System.out.println(isValid("[])"));
        System.out.println(isValid("[]()"));
        System.out.println(isValid("[{}]"));
    }


    public static boolean isValid(String s) {
        if (Objects.isNull(s) || s.length() == 0) return true;
        char[] chars = s.toCharArray();
        char[] stack = new char[s.length()];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = chars[i];
            if (c == '(' || c == '{' || c == '[') {
                stack[index++] = c;
            }
            if (c == ')') {
                if (index > 0 && stack[--index] == '(') {
                } else
                    return false;
            } else if (c == ']') {
                if (index > 0 && stack[--index] == '[') {
                } else
                    return false;
            } else if (c == '}') {
                if (index > 0 && stack[--index ] == '{') {
                } else
                    return false;
            }
        }
        if (index == 0) {
            return true;
        }
        return false;
    }



}
