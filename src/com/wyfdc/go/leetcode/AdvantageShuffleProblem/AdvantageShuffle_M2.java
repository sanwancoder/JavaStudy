package com.wyfdc.go.leetcode.AdvantageShuffleProblem;

import com.wyfdc.go.utils.ArrayUtils;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/advantage-shuffle/submissions/
 * <p>
 * 算法结果： 时间超时
 */
public class AdvantageShuffle_M2 {

    public static int[] advantageCount(int[] A, int[] B) {
        if (A == null || B == null || A.length == 0 || B.length == 0) {
            return new int[]{};
        }
        int[] res = new int[A.length];
        int i = 0;
        for (; i < B.length; i++) {
            int target = B[i];
            //从A数据中找到最小的大于target数据 A必须是排序的
            Arrays.sort(A);
            int index = findFirstLarger(A, target);
            if (index != -1) {
                res[i] = A[index];
                A[index] = -1;
            } else {
                res[i] = -1;
            }
        }

        //复制 将A数组中非-1 元素 复制到 set 中非-1元素位置
        Arrays.sort(A);
        int index = findFirstLarger(A, -1);
        if (index == -1) {
            return res;
        }
        for (i = 0; i < A.length; i++) {
            if (res[i] == -1) {
                res[i] = A[index++];
            }
        }
        return res;
    }


    // 查找第一个大于key的元素
    public static int findFirstLarger(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        // 这里必须是 <=
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        if(left==array.length){
            return -1;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] A = {2, 11, 7, 15}, B = {1, 10, 4, 11};
        int[] AA = {12, 24, 8, 32}, BB = {13, 25, 32, 11};
        int[] A1 = {2, 0, 4, 1, 2}, B1 = {1, 3, 0, 0, 2};
        int[] a = {1,3,4,7,9,12,34,56};
        ArrayUtils.sysout(advantageCount(A, B));
        ArrayUtils.sysout(advantageCount(AA, BB));
        ArrayUtils.sysout(advantageCount(A1, B1));
    }


}
