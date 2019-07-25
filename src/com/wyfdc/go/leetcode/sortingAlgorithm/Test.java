package com.wyfdc.go.leetcode.sortingAlgorithm;

import com.wyfdc.go.utils.ArrayUtils;

public class Test {
    public static void main(String[] args) {
        int[] array = {555,2, 5, 6, 87, 932, 6, 789,78};
        ArrayUtils.sysout(array);
//        ArrayUtils.sysout(SelectSort.sort(array));
        ArrayUtils.sysout(InsertSort.sort(ArrayUtils.copy(array)));
//        ArrayUtils.sysout(RadixSort.sort(ArrayUtils.copy(array)));
//        int[] dest = ArrayUtils.copy(array);
//        MergeSort.sort(dest,0,dest.length-1);
//        QuickSort.sort(array,0,array.length-1);
//        ArrayUtils.sysout(array);
    }


}
