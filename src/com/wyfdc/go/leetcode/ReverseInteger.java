package com.wyfdc.go.leetcode;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(1002));
    }


    public static int reverse(int x){
        long res = 0;
        for(;x!=0;x=x/10){
            res = res*10+x%10;
        }
        return (res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)?0:(int)res;
    }

}
