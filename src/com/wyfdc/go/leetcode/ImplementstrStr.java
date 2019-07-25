package com.wyfdc.go.leetcode;

/**
 * https://leetcode.com/problems/implement-strstr/
 */
public class ImplementstrStr {
    public static void main(String[] args) {
       /* System.out.println(strStr("hello","ll"));
        System.out.println(strStr("hello","0ll"));
        System.out.println(strStr("hello","ell"));
        System.out.println(strStr("hello","hello"));*/
        System.out.println(strStr("mississippi","issipi"));
        System.out.println(strStr("mississippi","ippii"));

        System.out.println(strStr("", ""));
    }


    public static int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if(len1==0&&len2==0) return 0;
        int j = 0;
        for (int i = 0; i < len1; i++) {
            if(len1-i<len2){
                return -1;
            }
            for (j = 0; j < len2; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j >= len2) {
                return i;
            }
        }
        return -1;
    }



}
