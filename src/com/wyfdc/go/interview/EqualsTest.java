package com.wyfdc.go.interview;

public class EqualsTest {

    public static void main(String[] args) {

        Long l1 = 100L;
        Long l2 = new Long(100L);
        String s1 = "123";
        String s2 = new String("123");
        System.out.println(l1==l2);
        System.out.println(s1==s2);
        System.out.println("=======================");
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = str2; // 引用传递
        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // true
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str2.equals(str3)); // true
    }
}
