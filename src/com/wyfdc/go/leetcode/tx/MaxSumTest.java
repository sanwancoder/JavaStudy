package com.wyfdc.go.leetcode.tx;

/**
 * 给定一个数组 array[1, 4, -5, 9, 8, 3, -6]，在这个数字中有多个连续子数组，
 * 子数组和最大的应该是：[9, 8, 3]， 输出20，
 * 再比如数组为[1, -2, 3, 10, -4, 7, 2, -5]， 和最大的子数组为[3, 10, -4, 7, 2]，输出18。
 */
public class MaxSumTest {

    public static void main(String[] args) {
        int[] a1 = {1, 4, -5, 9, 8, 3, -6};
        int[] a2 = {1, -2, 3, 10, -4, 7, 2, -5};
        System.out.println(getMaxSum(a1));
        System.out.println(getMaxSum1(a1));
        System.out.println(getMaxSum(a2));
    }

    public static int getMaxSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int res = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max + arr[i], arr[i]);
            res = Math.max(res, max);
        }
        return res;
    }

    public static int getMaxSum1(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int res = arr[0];
        int max = arr[0];
        int lt = 0;
        int rt = 0;
        int l = 0;
        int r = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max + arr[i]) {
                max = arr[i];
                lt = i;
                rt = i;
            } else {
                max = max + arr[i];
                rt++;
            }
            if (max > res) {
                res = max;
                r = rt;
                l = lt;
            }
        }
        System.out.println(arr[l] + " " + arr[r]);
        return res;
    }
}
