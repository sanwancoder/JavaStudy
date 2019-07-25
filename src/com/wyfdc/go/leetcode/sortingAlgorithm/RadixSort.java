package com.wyfdc.go.leetcode.sortingAlgorithm;

/**
 * 基数排序 O(d(n+radix))---- n个记录，d个关键码，关键码的取值范围为radix
 */
public class RadixSort {

    public static int[] sort(int[] arr) {
        //求出待排数的最大数
        int maxLength=0;
        for (int i = 0; i < arr.length; i++) {
            if(maxLength<arr[i])
                maxLength = arr[i];
        }
        //根据最大数求最大长度
        maxLength = (maxLength+"").length();

        //用于暂存数据的数组
        int[][] temp = new int[10][arr.length];
        //用于记录temp数组中每个桶内存的数据的数量
        int[] counts = new int[10];
        //用于记录每个数的i位数
        int num = 0;
        //用于取的元素需要放的位置
        int index = 0;
        //根据最大长度决定排序的次数
        for (int i = 0,n=1; i < maxLength; i++,n*=10) {
            for (int j = 0; j < arr.length; j++) {
                num = (arr[j]/n)%10;
                temp[num][counts[num]] = arr[j];
                counts[num]++;
            }

            //从temp中取元素重新放到arr数组中
            for (int j = 0; j < counts.length; j++) {
                for (int k = 0; k < counts[j]; k++) {
                    arr[index] = temp[j][k];
                    index++;
                }
                counts[j]=0;
            }
            index=0; //重新置 0
        }
        return arr;
    }

}
