package com.wyfdc.go.leetcode.hw;

import java.util.Scanner;

/**
 * 没有保证输入顺序
 */
public class UniqueCharSeq_M2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            char[] c = in.next().toCharArray();
            StringBuffer sb = new StringBuffer();
            int[] chars = new int[255];
            for (int i = 0; i < c.length; i++) {
                chars[c[i]] = 1;
            }
            for(int i=0;i<255;i++){
                if(chars[i]==1){
                    sb.append((char)i);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
