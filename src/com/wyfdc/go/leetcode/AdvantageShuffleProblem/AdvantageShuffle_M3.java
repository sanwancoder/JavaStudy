package com.wyfdc.go.leetcode.AdvantageShuffleProblem;

import com.wyfdc.go.utils.ArrayUtils;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/advantage-shuffle/submissions/
 *
 * TreeSet HashMap
 */
public class AdvantageShuffle_M3 {

    public static int[] advantageCount(int[] A, int[] B) {
        if (A == null || B == null || A.length == 0 || B.length == 0) {
            return new int[]{};
        }
        int[] res = new int[A.length];
        int i=0;
        for(;i<B.length;i++){
            int target = B[i];
            //从A数据中找到最小的大于target数据 A必须是排序的
            Arrays.sort(A);
            int index = minValueIndex(A,target);
            if(index!=-1){
                res[i] = A[index];
                A[index] = -1;
            }else {
                res[i] = -1;
            }
        }

        //复制 将A数组中非-1 元素 复制到 set 中非-1元素位置
        Arrays.sort(A);
        int index = minValueIndex(A,-1);
        if(index==-1){
            return res;
        }
        for(i=0;i<A.length;i++){
            if(res[i]==-1){
                res[i] = A[index++];
            }
        }
        return res;
    }

    //找出最小下表位置
    private static int minValueIndex(int[] A,int target){
        for(int i=0;i<A.length;i++){
            if(A[i]>target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {2, 11, 7, 15}, B = {1, 10, 4, 11};
        int[] AA = {12, 24, 8, 32}, BB = {13, 25, 32, 11};
        int[] A1 = {2, 0, 4, 1, 2}, B1 =  {1, 3, 0, 0, 2};
        ArrayUtils.sysout(advantageCount(A, B));
        ArrayUtils.sysout(advantageCount(AA, BB));
        ArrayUtils.sysout(advantageCount(A1, B1));
    }


}
