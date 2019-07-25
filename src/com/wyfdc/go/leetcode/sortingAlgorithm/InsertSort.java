package com.wyfdc.go.leetcode.sortingAlgorithm;

import com.wyfdc.go.utils.ArrayUtils;

/**
 * 时间复杂度: n*n
 */
public class InsertSort {

    /**
     * 插入排序
     * @param array
     * @return
     */
    public static int[] sort(int[] array) {
        if (array.length == 0)
            return array;
        int current;
            for (int i = 0; i < array.length - 1; i++) {
                current = array[i + 1];
                int preIndex = i;
                while (preIndex >= 0 && current < array[preIndex]) {
                    array[preIndex + 1] = array[preIndex];
                    preIndex--;
                }
            array[preIndex + 1] = current;
//            ArrayUtils.sysout(array);
        }
        return array;
    }


}
