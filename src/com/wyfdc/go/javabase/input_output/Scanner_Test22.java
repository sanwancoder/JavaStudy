package com.wyfdc.go.javabase.input_output;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
 * 2、可以获得空白。
 */
public class Scanner_Test22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        System.out.println("请输入数据");
        if(scanner.hasNextLine()){
            String string = scanner.nextLine();
            String[] array = string.split(",");
            int size = array.length;
            int[] intArray = new int[size];
            for(int i=0;i<size;i++){
                intArray[i] = Integer.valueOf(array[i]);
            }
            System.out.println("\n\n输入数据为： "+string);
            System.out.println(Arrays.toString(intArray));
        }

        scanner.close();

    }

}
