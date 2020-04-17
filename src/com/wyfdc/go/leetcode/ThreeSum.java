package com.wyfdc.go.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum/
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return res;
        }
        Arrays.sort(nums); //排序
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) { //开头位置不能重复
                continue;
            }
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    right--;
                    left++;
                    //中间不能重复
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (nums[left] + nums[right] > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {0, 0, 0, 0};
        threeSum(nums);
        threeSum(nums2);
    }


}
