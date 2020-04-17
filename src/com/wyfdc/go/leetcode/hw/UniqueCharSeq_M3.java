package com.wyfdc.go.leetcode.hw;

import java.util.Scanner;

/**
 * 效率没有M1 高
 */
public class UniqueCharSeq_M3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            char[] c = in.next().toCharArray();
            StringBuffer sb = new StringBuffer();
            for(int i=0;i<c.length;i++){
                if(!sb.toString().contains(String.valueOf(c[i]))){  //
                    sb.append(c[i]);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
