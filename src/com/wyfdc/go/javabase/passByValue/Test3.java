package com.wyfdc.go.javabase.passByValue;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("before change: s = "+s);
        changeS(s);
        System.out.println("after change: s = "+s);

    }

    public static void changeS(String s) {
        s = s+" world";
    }
}
