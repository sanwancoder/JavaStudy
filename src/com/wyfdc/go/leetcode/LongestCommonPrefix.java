package com.wyfdc.go.leetcode;

import java.util.Vector;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[]  strs = new String[]{
                "123aa",
                "123ca",
                "123a" };
        System.out.println("res:"+longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs){
        if(strs.length==0){
            return "";
        }
        int minLength = strs[0].length();
        for(int i=1;i<strs.length;i++){
            if(minLength>strs[i].length()){
                minLength = strs[i].length();
            }
        }

        for(int i=0;i<minLength;i++){
            for(int j=1;j<strs.length;j++){
                if(i>strs[j].length()||(strs[0].charAt(i)!=strs[j].charAt(i))){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0].substring(0,minLength);
    }

}
