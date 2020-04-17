package com.wyfdc.go.leetcode.palindrome;

import java.util.Objects;

public class Palindrome_method2 {

    public static boolean isPalindrome(String str) {
        if (Objects.isNull(str) || str.length() == 0) {
            return true;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("123"));
        System.out.println(isPalindrome("1232"));
        System.out.println(isPalindrome("12321"));
        System.out.println(isPalindrome("123321"));
    }



}
