package com.wyfdc.go.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {


    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,4,4,5,5,6};
        System.out.println(removeDuplicates(nums));
        System.out.println("==============");
        Arrays.stream(nums).forEach(x->{
            System.out.print(x);
        });
//        System.out.println(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int tail = 0;
        for(int i=1;i<len;i++){
            if(nums[tail]!=nums[i]){
                nums[++tail] = nums[i];
            }
        }
        return tail+1;
    }

}
