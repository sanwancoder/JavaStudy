package com.wyfdc.go.leetcode.RotatedSortedArray;

public class RotatedSortedArray_M1 {
    public int search(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return -1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
