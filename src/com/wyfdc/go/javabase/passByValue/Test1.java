package com.wyfdc.go.javabase.passByValue;

public class Test1 {
    public static void main(String[] args) {
        int a = 3;
        System.out.format("before change: a=%d\n", a);
        changeValue(a);
        System.out.format("after change: a=%d\n", a);
    }

    public static void changeValue(int value) {
        value = 5;
    }
}
