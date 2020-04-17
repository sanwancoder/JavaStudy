package com.wyfdc.go.leetcode.sortingAlgorithm;

/**
 * 选择排序（Selection sort）是一种简单直观的排序算法。它的工作原理是：
 *   第一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，然后再从剩余的未排序元素中寻找到最小（大）元素，
 *   然后放到已排序的序列的末尾。以此类推，直到全部待排序的数据元素的个数为零。选择排序是不稳定的排序方法。
 */
public class SelectSort {

    public static int[] sort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            //swap 下表 i 和 min
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
        return array;
    }

}
