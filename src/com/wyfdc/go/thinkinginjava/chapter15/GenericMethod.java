package com.wyfdc.go.thinkinginjava.chapter15;

/**
 * 范型方法
 */
public class GenericMethod {


    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.f(1);
        genericMethod.f("1111");
        genericMethod.f(1.000f);
        genericMethod.f(1.0);
        genericMethod.f(true);
    }

}
