package com.wyfdc.go.javabase.callBy;

import java.util.Arrays;

/**
 * @Author:  
 */
public class Example2 {

  public static void main(String[] args) {
    Integer[]  array = {1,2,3,4,5};
    setFirstZero(array);
    Arrays.asList(array).stream().forEach(x -> System.out.print(x + " "));
    System.out.println("\n========================\n");
    Arrays.asList(array).stream().forEach(x -> System.out.print(x + " "));
    System.out.println("\n" + array);
  }

  public static void setFirstZero(Integer[] array){
    array[0] = 0;
    System.out.println(array);
    Arrays.asList(array).stream().forEach(x -> System.out.print(x + " "));
  }

}
