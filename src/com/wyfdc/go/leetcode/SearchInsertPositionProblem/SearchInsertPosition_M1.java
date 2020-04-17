package com.wyfdc.go.leetcode.SearchInsertPositionProblem;

/**
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition_M1 {

    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return binarySearch(nums,target,0,nums.length-1);
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {
        if (right - left == 0) {
            if (nums[right] >= target) {
                return right;
            } else {
                return right + 1;
            }
        }
        int mid = (right+left)/2;
        if(nums[mid]>target){
            return binarySearch(nums,target,left,mid);
        }else if(nums[mid]<target){
            return binarySearch(nums,target,mid+1,right);
        }else {
            return mid;
        }
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
