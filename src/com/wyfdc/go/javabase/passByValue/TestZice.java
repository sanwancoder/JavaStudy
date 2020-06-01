package com.wyfdc.go.javabase.passByValue;

import java.lang.reflect.Field;

public class TestZice {

    public static void main(String[] args) {
        Integer a = 3;
        Integer b = 5;
        System.out.format("a=%d,b=%d\n", a, b);
        swap(a, b);
        System.out.format("a=%d,b=%d\n", a, b);
    }


    public static void swap(Integer a, Integer b) {
        int tmp = a;
        try {
            Class clazz = a.getClass();
            Field value = clazz.getDeclaredField("value");
            value.setAccessible(true);
            value.setInt(a, b);
            value.setInt(b, tmp);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
