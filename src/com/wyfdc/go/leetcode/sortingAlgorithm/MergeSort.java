package com.wyfdc.go.leetcode.sortingAlgorithm;

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
