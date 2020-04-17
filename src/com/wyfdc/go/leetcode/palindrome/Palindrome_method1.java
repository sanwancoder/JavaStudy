package com.wyfdc.go.leetcode.palindrome;

import java.util.Objects;

public class Palindrome_method1 {

    public static boolean isPalindrome(String str){
        if(Objects.isNull(str)||str.length()==0){
            return true;
        }
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();//将str倒置的方法
        String newStr=new String(sb);
        if(newStr.equals(str)){
            return true;
        }
        return false;
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
