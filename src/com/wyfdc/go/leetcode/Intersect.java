package com.wyfdc.go.leetcode;

import com.wyfdc.go.utils.ArrayUtils;

import java.util.*;

/**
 *
 */
public class Intersect {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        int[] r = intersect(nums1, nums2);
        ArrayUtils.sysout(r);
        int[] nums3 = {4, 9, 5}, nums4 = {9, 4, 9, 8, 4};
        r = intersect(nums3, nums4);
        ArrayUtils.sysout(r);

        int[] nums5 = {}, nums6 = {};
        r = intersect(nums5, nums6);

        ArrayUtils.sysout(r);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) return new int[]{};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            Integer ii = map.get(nums1[i]);
            if (ii == null) map.put(nums1[i], 1);
            else map.put(nums1[i], ii + 1);


        }
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums2.length; i++) {
            Integer rr = map.get(nums2[i]);
            if (rr != null && rr > 0) {
                res.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        if (res.isEmpty() || res.size() == 0) return new int[]{};

        int[] r = new int[res.size()];
        for (int i = 0; i < res.size(); i++)
            r[i] = res.get(i).intValue();
        return r;
    }

}
