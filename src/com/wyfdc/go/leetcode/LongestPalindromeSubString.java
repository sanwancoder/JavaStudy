package com.wyfdc.go.leetcode;

public class LongestPalindromeSubString {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("12321"));
        System.out.println(longestPalindrome("aasd"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("aa"));
    }

    /**
     * d[i][j]
     *     i==j true
     *     i+1==j d[i]=d[j] true
     *     i+1<j  d[i+1][j-1] ==true && d[i]==d[j] true
     *
     * @param s
     * @return
     */
    public static String longestPalindrome(String s){
        int len = s.length();
        if(len<2){
            return s;
        }
        char[] arr = s.toCharArray();
        boolean[][] d = new boolean[len][len];
        int start = 0 ;
        int end = 0;
        for(int i=0;i<len;i++){
            d[i][i] = true;
            for(int j=0;j<i;j++){
                if(j+1==i){
                    d[j][i] = (arr[i]==arr[j]);
                }else{
                    d[j][i] = d[j+1][i-1] && (arr[i]==arr[j]);
                }
                if(d[j][i] && (i-j>end-start)){
                    end = i;
                    start = j;
                }
            }
        }
        return s.substring(start,end+1);
    }
}
