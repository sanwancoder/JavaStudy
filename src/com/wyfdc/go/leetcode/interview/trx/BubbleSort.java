package com.wyfdc.go.leetcode.interview.trx;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] a) {
        if (a == null || a.length == 0) return;
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    // swap
                    int temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {23, 43, 1, 243, 3, 4, 6657,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}