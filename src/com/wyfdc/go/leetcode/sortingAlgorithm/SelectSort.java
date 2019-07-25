package com.wyfdc.go.leetcode.sortingAlgorithm;

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
