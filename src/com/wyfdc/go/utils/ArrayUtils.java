package com.wyfdc.go.utils;

import java.util.Arrays;

public class ArrayUtils {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,7};
        sysout(arr);
        int[] dst = copy(arr);
        sysout(dst);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] makeArray(int size){
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = i+100;
        }
        return arr;
    }

    public static Long sum(int[] arr){
        long sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void sysout(int[] array) {
        System.out.println("---------------------------------");
        System.out.println(Arrays.toString(array));
        System.out.println("---------------------------------\n\n");
    }

    public static int[] copy(final int[] sources) {
        int[] dest = new int[sources.length];
        for (int i = 0; i < sources.length; i++) {
            dest[i] = sources[i];
        }
        return dest;
    }

    public static String[] getNameArray(){
        return new String[] {"王五", "李四", "冯北", "刘青扬", "刘士凯", "薛贵", "赵钱孙"};
    }
}
