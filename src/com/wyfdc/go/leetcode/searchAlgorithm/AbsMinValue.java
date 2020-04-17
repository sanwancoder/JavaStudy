package com.wyfdc.go.leetcode.searchAlgorithm;

/**
 * 算法：一个有序数组（从小到大排列），
 * 数组中的数据有正有负，求这个数组中的最小绝对值
 * <p>
 * <p>
 * 其实就是找最大正数和最小负数 ----->>> 绝对值最小值一定是在正数负数交界处
 * <p>
 * -9，-7，-6，-2,1,3,45,78
 */
public class AbsMinValue {

    public static int getAbsMinValue(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        //处理特殊情况  数组全是正数
        if (array[left] >= 0) {
            return array[0];
        }
        //数组全是负数
        if (array[right] <= 0) {
            return Math.abs(array[right]);
        }
        int mid = 0;
        //找到最小正数、最小负数
        while (right - left > 1) {
            mid = left + ((right - left) >> 1);
            if (array[mid] == 0) {
                return 0;
            } else if (array[mid] > 0) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return Math.abs(Math.min(array[left], array[right]));
    }

    public static void main(String[] args) {
        int[] a0 = null;
        int[] a1 = {};
        int[] a2 = {1, 2, 3, 4, 5, 6};
        int[] a3 = {0, 1, 2, 3, 4, 6};
        int[] a4 = {-9, -6, -4, -1};
        int[] a5 = {-9, -6, -4, -1, 0};
        int[] a6 = {-9, -6, -4, -1, 0, 1, 2, 3, 4};
        int[] a7 = {-9, -6, -4, -1, 1, 2, 3, 4};
        int[] a8 = {-9, -6, -4, -1, 0, 1, 2, 3, 4, 6, 7, 8, 9, 12};
        int[] a9 = {-9, -6, -4, -1, 2, 3, 4, 6, 7, 8, 9, 12};
        System.out.println(AbsMinValue.getAbsMinValue(a0));
        System.out.println(AbsMinValue.getAbsMinValue(a1));
        System.out.println(AbsMinValue.getAbsMinValue(a2));
        System.out.println(AbsMinValue.getAbsMinValue(a3));
        System.out.println(AbsMinValue.getAbsMinValue(a4));
        System.out.println(AbsMinValue.getAbsMinValue(a5));
        System.out.println(AbsMinValue.getAbsMinValue(a6));
        System.out.println(AbsMinValue.getAbsMinValue(a7));
        System.out.println(AbsMinValue.getAbsMinValue(a8));
        System.out.println(AbsMinValue.getAbsMinValue(a9));
    }


}
