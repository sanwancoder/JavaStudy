package com.wyfdc.go.leetcode;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(102));
        System.out.println(isPalindrome(101));
    }

    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int tmp = x;
        long res = 0;
        for(;x!=0;x=x/10){
            res = res*10+x%10;
        }
        res =  (res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)?0:(int)res;
        return res == tmp;
    }


}
