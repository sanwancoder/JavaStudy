package com.wyfdc.go.leetcode;

/**
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] arr = {1,2,3,6,8,9,23,56};
        int target = 7;
        System.out.println(searchInsert(arr,target) +" "+arr[searchInsert(arr,target)]);
        System.out.println(binarySerach(arr,11) );
        System.out.println(binarySerach(arr,8) );
        System.out.println(binarySerach(arr,9) );
        System.out.println(binarySerach(arr,56) );
        System.out.println(binarySerach(arr,1) );
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) >> 1;
        while (left <= right) {
            if (target <= nums[mid]) right = mid - 1;
            else left = mid + 1;
            mid=left + ((right-left)>>1);  //防止溢出，移位也更高效。同时，每次循环都需要更新。
        }
        return left;
    }

    public static int binarySerach(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <=right) {
            int mid=left + ((right-left)>>1);  //防止溢出，移位也更高效。同时，每次循环都需要更新。
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left = mid + 1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }

}
