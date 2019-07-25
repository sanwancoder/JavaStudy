package com.wyfdc.go.javabase.reflect.DeclaredXX;

/**
 * @Author:
 */
public class Outer {

  //内部类
  public static class InnerClass{
    public InnerClass(){};

    public void fun(){};
  }

  //内部接口
  public interface InnerInterface{};

  public static void main(String[] args) {
    System.out.println("InnerClass.class.getDeclaredClasses() = "+InnerClass.class.getDeclaredClasses());
    System.out.println("InnerInterface.class.getDeclaredClasses() = "+InnerInterface.class.getDeclaredClasses());

  }

}
