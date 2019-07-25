package com.wyfdc.go.javabase.callBy;

/**
 * @Author:  
 */
public class Example3 {

  public static void main(String[] args) {
    Student l = new Student("lisi");
    Student z = new Student("zhangsan");
    swap(l,z);
    System.out.println("l.name = "+l.getName());
    System.out.println("z.name = "+z.getName());
  }

  public static void swap(Student a,Student b){
    Student t = a;
    a = b;
    b = t;
    System.out.println("a.name = "+a.getName());
    System.out.println("b.name = "+b.getName());
    System.out.println("=======================");
  }

}
