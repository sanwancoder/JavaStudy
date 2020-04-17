package com.wyfdc.go.leetcode.RotatedSortedArray;

public class RotatedSortedArray_M2 {

    //知道最小值 然后进行二分查找 相邻的两个值一定是左边大于右边
    /**
     * https://leetcode.com/problems/search-in-rotated-sorted-array/
     * <p>
     * 1 2 4 5 6 7 0
     * 2 4 5 6 7 0 1
     * 4 5 6 7 0 1 2
     * 5 6 7 0 1 2 4
     * 6 7 0 1 2 4 5
     * 7 0 1 2 4 5 6
     */
    public static int finMinIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            if (nums[l] < nums[r]) {
                return l;
            }
            int mid = l + ((r - l) >> 1); // 6 7 0 1 2 4 5
            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else{ r = mid;}
        }
        return l;
    }

    public static int searchByBin(int[] nums, int target,int l,int r) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
   /*     int l = 0;
        int r = nums.length - 1;*/
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }


    public static int search(int[] nums, int target) {
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

    public static void main(String[] args) {
        int[] nums1 = { 4,5,6,7,0,1,2};
        System.out.println(search(nums1,0));
        System.out.println(search(nums1,3));
    }

}
