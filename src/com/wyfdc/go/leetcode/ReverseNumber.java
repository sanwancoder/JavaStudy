package com.wyfdc.go.leetcode;

public class ReverseNumber {

    public static void main(String[] args){
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
    }
    public static int reverse(int x) {
        String str = Integer.toString(x);
        StringBuilder temp = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            temp.append(str.charAt(i));
            if (temp.charAt(temp.length() - 1) == '-') {
                temp.deleteCharAt(temp.length() - 1);
                temp.insert(0, '-');
            }
            if (temp.charAt(0) == '-' && temp.charAt(1) == '0') {
                temp.deleteCharAt(1);
            }
            if (temp.charAt(0) == '0') {
                temp.deleteCharAt(0);
            }
        }

        if (temp.length() == 0) {
            return 0;
        }
        long number = Long.parseLong(temp.toString());
        if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) number;
    }
}
