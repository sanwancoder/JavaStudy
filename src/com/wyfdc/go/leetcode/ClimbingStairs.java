package com.wyfdc.go.leetcode;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(45));
        System.out.println(climbStairs1(45));
    }

    /***
     * 超时
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climbStairs1(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        int a = 1;
        int b = 2;
        for (int i = 2; i < n; i++) {
            b = a + b;
            a = b - a;
        }
        return b;
    }

}
