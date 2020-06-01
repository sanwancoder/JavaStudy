package com.wyfdc.go.leetcode;

/**
 * https://leetcode.com/problems/majority-element/
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        if(nums==null||nums.length==0){
            return -1;
        }
        int target = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                count =1;
                target = nums[i];
                continue;
            }
            if(target==nums[i]){
                count++;
            }else {
                count--;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int[] num1 = {3,2,3};
        int[] num2 = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(num1));
        System.out.println(majorityElement(num2));
    }
}
