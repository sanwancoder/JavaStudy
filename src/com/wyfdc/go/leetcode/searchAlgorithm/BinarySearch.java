package com.wyfdc.go.leetcode.searchAlgorithm;

/**
 * 二分查找算法
 *
 * https://blog.csdn.net/bat67/article/details/72049104
 */
public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        //传入一个元素情况
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    // 查找最后一个小于key的元素
    // 返回 right
    public static int findLastSmaller(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        // 这里必须是 <=
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] >= key) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return right;
    }


    // 查找第一个相等的元素
    //返回 left
    public static int firstEqualSearch(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        // 这里必须是 <=
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (left < array.length && array[left] == target) {
            return left;
        }
        return -1;
    }

    // 查找最后一个相等的元素
    //返回 right
    static int findLastEqual(int[] array, int key) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        // 这里必须是 <=
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] <= key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        if (right >= 0 && array[right] == key) {
            return right;
        }
        return -1;
    }

    // 查找最后一个等于或者小于key的元素
    //返回 right
    public static int findLastEqualSmaller(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        // 这里必须是 <=
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        System.out.println(target + " --->>>"+array[right]);
        return right;
    }

    // 查找第一个等于或者大于key的元素
    //返回 left
    public static int findFirstEqualLarger(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        // 这里必须是 <=
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] >= target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        if(left==array.length){
            return -1;
        }
//        System.out.print(target +" --->>>"+array[left]+", ");
        return left;
    }

    // 查找第一个大于key的元素
    //返回 left
    public static int findFirstLarger(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        // 这里必须是 <=
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        if(left==array.length){
            return -1;
        }
//        System.out.print(target + "--->>>"+array[left]+", ");
        return left;
    }



    public static void main(String[] args) {
        int[] a1 ={1};
        int[] a2 ={1,2,3,4,6,7,8};
        int[] a3 ={};
        int[] a4 ={1,2,3,3,3,3,3,4,6,7,8,8,8,10,10,12};
/*        System.out.println(BinarySearch.search(a1,1));
        System.out.println(BinarySearch.search(a1,2));
        System.out.println(BinarySearch.search(a2,1));
        System.out.println(BinarySearch.search(a2,8));
        System.out.println(BinarySearch.search(a2,6));
        System.out.println(BinarySearch.search(a2,5));
        System.out.println(BinarySearch.search(a2,9));
        System.out.println(BinarySearch.search(a2,-1));
        System.out.println(BinarySearch.search(null,1));
        System.out.println(BinarySearch.search(a3,1));*/

/*        System.out.println(BinarySearch.firstEqualSearch(a4,1));
        System.out.println(BinarySearch.firstEqualSearch(a4,3));
        System.out.println(BinarySearch.firstEqualSearch(a4,8));
        System.out.println(BinarySearch.firstEqualSearch(a4,10));
        System.out.println(BinarySearch.firstEqualSearch(a4,5));
        System.out.println(BinarySearch.firstEqualSearch(a4,9));
        System.out.println(BinarySearch.firstEqualSearch(a4,12));
        System.out.println(BinarySearch.firstEqualSearch(a4,-1));*/


        System.out.println(BinarySearch.findFirstEqualLarger(a4,1));
        System.out.println(BinarySearch.findFirstEqualLarger(a4,3));
        System.out.println(BinarySearch.findFirstEqualLarger(a4,8));
        System.out.println(BinarySearch.findFirstEqualLarger(a4,10));
        System.out.println(BinarySearch.findFirstEqualLarger(a4,5));
        System.out.println(BinarySearch.findFirstEqualLarger(a4,9));
        System.out.println(BinarySearch.findFirstEqualLarger(a4,12));
        System.out.println(BinarySearch.findFirstEqualLarger(a4,15));

    }


}
