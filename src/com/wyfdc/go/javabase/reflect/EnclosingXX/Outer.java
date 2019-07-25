package com.wyfdc.go.javabase.reflect.EnclosingXX;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
/**
 * @Author:
 */
public class Outer {

  public Outer(){
    InnerClass innerClass = new InnerClass(){
      @Override
      public void fun() {
        getEnclosing(this.getClass());
      }
    };
    innerClass.fun();
  }

  public static void test(){
    InnerClass innerClass = new InnerClass() {
      @Override
      public void fun() {
        getEnclosing(this.getClass());
      }
    };
    innerClass.fun();
  }

  public static class InnerClass{
    public InnerClass(){}
    public void fun(){}
  }

  //匿名类
  static InnerClass innerClass = new InnerClass(){
    @Override
    public void fun() {
      getEnclosing(this.getClass());
    }
  };

  public static void getEnclosing(Class cls){
    Class enclosingClass = cls.getEnclosingClass();
    Constructor constructor = cls.getEnclosingConstructor();
    Method enclosingMethod = cls.getEnclosingMethod();
    System.out.println("enclosingClass= " + enclosingClass);
    System.out.println("constructor= " + constructor);
    System.out.println("enclosingMethod= " + enclosingMethod);
  }

  public static void main(String[] args) {
    System.out.println("------内部类------");
    getEnclosing(InnerClass.class);

    System.out.println("------匿名内部类------");
    innerClass.fun();

    System.out.println("------方法中的匿名内部类------");
    test();

    System.out.println("------构造函数中的匿名内部类------");
    new Outer();

  }


}
