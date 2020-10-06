package com.wyfdc.go.leetcode.interview.qml;

import java.util.Objects;

public class BigIntStringAdd4 {


    public static void main(String[] args) {
        String s1 = "1111111111111111111";
        String s2 = "3333333333333333333";
        String s3 = "8888888888888888888";
        System.out.println(addBigIntString(s1,s2));
        System.out.println(addBigIntString(s3,s2));
    }

    public static String addBigIntString(String str1,String str2){
        if (Objects.isNull(str1)) {
            return str2;
        }
        if (Objects.isNull(str2)) {
            return str1;
        }
        int length1 = str1.length()-1;
        int length2 = str2.length()-1;
        int carry = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (length1 >=0 || length2 >=0) {
            int num1 = length1>=0?str1.charAt(length1)-'0':0;
            int num2 = length2>=0?str2.charAt(length2)-'0':0;
            int temp = num1 + num2+carry;
            carry = temp/10;
            stringBuilder.append(temp%10);
            length1--;
            length2--;
        }
        if (carry >0) {
            stringBuilder.append(carry);
        }
        return stringBuilder.reverse().toString();
    }

}
