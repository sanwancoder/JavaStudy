package com.wyfdc.go.leetcode.sortingAlgorithm;

/**
 * 时间复杂度: n*log(n)
 */
public class QuickSort {

    private static int Partition(int[] arr, int start, int end) {
        //arr[start]为挖的第一个坑
        int key = arr[start];
        while (start < end) {
            while (arr[end] >= key && end > start)
                end--;
            arr[start] = arr[end];
            while (arr[start] <= key && end > start)
                start++;
            arr[end] = arr[start];
        }
        arr[start] = key;
        return start;
    }

    public static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int index = Partition(arr, start, end);
            sort(arr, start, index - 1);
            sort(arr, index + 1, end);
        }
    }
}