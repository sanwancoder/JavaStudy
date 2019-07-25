package com.wyfdc.go.leetcode;

/**
 * 求一个有序数组中绝对值最小的值
 */
public class MinAbsFromArray {


    public static void main(String[] args) {
        int arrs[] = {-4,-2,5,7,9};
        int arrs1[] = {1,2,3,4,5};
        int arrs2[] = {-4,-2,-1};
        int arrs3[] = {-4,-2,5,7,9,99};
        System.out.println(getAbsMin(arrs));
        System.out.println(getAbsMin(arrs1));
        System.out.println(getAbsMin(arrs2));
        System.out.println(getAbsMin(arrs3));
    }

    public static int getAbsMin(int[] a){

        int left = 0;
        int right = a.length-1;
        int mid;

        if(a[left]>=0){  //全部为正数
            return a[left];
        }

        if(a[right]<=0){
            return a[right];
        }

        /**
         * 找出最小整数 和左边的负数进行比较
         */
        while(left <= right){
            mid = (left + right)/2;
            if(a[mid]>0){
                if(a[mid-1]<0){
                   return Math.abs(a[mid])>Math.abs(mid-1)?a[mid-1]:a[mid];
                }
                right = mid - 1;
            }else if(a[mid]<0){
                left = mid+1;
            }else{
                return a[mid];
            }

        }
        return -1;
    }
}
