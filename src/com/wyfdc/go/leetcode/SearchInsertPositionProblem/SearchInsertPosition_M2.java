package com.wyfdc.go.leetcode.SearchInsertPositionProblem;

/**
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition_M2 {

    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i;
        for (i = 0; i < nums.length; i++) {
            if(nums[i]>=target){
                break;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6};
        int[] a1 = {1, 3};
        System.out.println(searchInsert(a, 5)); //2
        System.out.println(searchInsert(a, 2)); //1
        System.out.println(searchInsert(a, 7)); //4
        System.out.println(searchInsert(a, 0)); //0
        System.out.println(searchInsert(a1, 2)); //1
        System.out.println(searchInsert(a1, 1)); //0
        System.out.println(searchInsert(a1, 0)); //0
    }

}



