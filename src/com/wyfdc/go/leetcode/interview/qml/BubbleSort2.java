package com.wyfdc.go.leetcode.interview.qml;

public class BubbleSort2 {

    public static void main(String[] args) {

        int array[] = {10,-101,2,5,3,4,6};
        BubbleSort2.BubbleSort(array);
        for(int i=0;i<7;i++){
            System.out.println(array[i]);
        }
    }

    public static void BubbleSort(int[] array) {
        int i,j;
        for(i=0;i<array.length-1;i++)
        {
            for(j=0;j<array.length-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

}
