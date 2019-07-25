package com.wyfdc.go.javabase.callBy;

/**
 * @Author:  
 */
public class Example1 {

  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 20;

    swap(num1,num2);

    System.out.println("================================");
    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);
  }

  public static void swap(int a,int b){
    int tmp = a;
    a = b;
    b = tmp;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }


}
