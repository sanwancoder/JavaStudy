package com.wyfdc.go.leetcode;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthofLastWord {

    public static void main(String[] args) {
        System.out.println("p");
        System.out.println(lengthOfLastWord("pp kk "));
    }

    public static int lengthOfLastWord(String s) {
        int p = s.length() - 1;
        while (p >= 0 && s.charAt(p) == ' ') p--;
        int end = p;
        while (p >= 0 && s.charAt(p) != ' ') p--;
        return end - p;
    }

}
