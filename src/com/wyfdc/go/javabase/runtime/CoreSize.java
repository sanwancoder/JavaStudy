package com.wyfdc.go.javabase.runtime;

/**
 * @Author:  
 */
public class CoreSize {

  public static void main(String[] args) {
    // get the number of processors available to the Java virtual machine.
    int coreSize = Runtime.getRuntime().availableProcessors() * 2;
    System.out.println(coreSize);
  }


}
