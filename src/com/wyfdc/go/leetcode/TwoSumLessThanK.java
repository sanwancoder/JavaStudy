package com.wyfdc.go.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum-less-than-k/
 */
public class TwoSumLessThanK {


    public static void main(String[] args) {

        int[] array = {34,23,1,24,75,33,54,8};
        int[] array2 = {10,20,30};
        System.out.println(sumLessThanK(array,60));
        System.out.println(sumLessThanK(array2,15));

    }

    public static int sumLessThanK(int[] array,int target){
        int res = -1;
        if(array == null || array.length == 0){
            return res;
        }

        Arrays.sort(array);
        int l = 0;
        int r  = array.length-1;
        while(l<r){
            int sum = array[l] + array[r];
            if(sum < target){
                res = Math.max(res, sum);
                l++;
            }else{
                r--;
            }
        }

        return res;
    }

}
