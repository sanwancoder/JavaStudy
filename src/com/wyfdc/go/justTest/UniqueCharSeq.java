package com.wyfdc.go.justTest;

import java.util.HashSet;
import java.util.Set;

/**
 * 输入一个字符串，求出该字符串包含的字符集合
 */
public class UniqueCharSeq {

    public static void main(String[] args) {
        String s = printUnique("fsdfsdfsdfsdaaa");
        System.out.println(s);
    }

    public static String printUnique(String s) {
        if (s == null && s.length() == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder("");
        Set<Character> set = new HashSet<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (!set.contains(c)) {
                stringBuilder.append(c);
            }
            set.add(c);
        }
        return stringBuilder.toString();
    }

/*    public static String printUnique1(String s) {
        if (s == null && s.length() == 0) {
            return null;
        }
        int[] a = new int[255];
        StringBuilder stringBuilder = new StringBuilder("");
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            a[c] = 1;
        }
        for(int i=0;i<255;i++){
            if(a[i]==1){
            stringBuilder.append((char)i);}
        }
        return stringBuilder.toString();
    }*/

}
