package com.wyfdc.go.leetcode.sortingAlgorithm;

/**
 * 归并排序（MERGE-SORT）是利用归并的思想实现的排序方法，
 * 该算法采用经典的分治（divide-and-conquer）策略（分治法将问题分(divide)成一些小的问题然后递归求解，
 * 而治(conquer)的阶段则将分的阶段得到的各答案"修补"在一起，即分而治之)。
 */
public class MergeSort {

    public static void sort(int[] array,int low,int high) {
        if ((high-low) == 0||((high-low) == 1)) {
            return;
        }
        int mid = (low + high) / 2;
        if (low < high) {
            // 左边
            sort(array, low, mid);
            // 右边
            sort(array, mid + 1, high);
            // 左右归并
            mergeSort(array, low, mid, high);
        }

    }

    private static void mergeSort(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        //把数据移动到temp数据之中
        while (i <= mid && j <= high) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= high) {
            temp[k++] = array[j++];
        }
        //copy
        for (k = 0; k < temp.length; k++) {
            array[low + k] = temp[k];
        }
    }

}
