package com.wyfdc.go.leetcode;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,2,1,7};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
            res = res ^nums[i];
        }
        return res;
    }
}
