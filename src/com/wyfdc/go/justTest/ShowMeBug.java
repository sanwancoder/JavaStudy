package com.wyfdc.go.justTest;

// 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
// 例如给定数字49。预期得到结果4。运算过程：4+9=13, 1+3=4，4只有1位数，所以就是结果。
// 提示：取余数使用%

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ShowMeBug {
    public static void main(String[] args) {
        String s = "{}[]{{}}";
        boolean result = isValidString(s);
        // 预期输出true
        System.out.println(result);
        //    System.out.println(null);
        System.out.println(isValidString(""));
        System.out.println(isValidString(null));
        System.out.println(isValidString("{}[]{{}"));


    }

    public static boolean isValidString(String s) {

        if(s==null || s.equals("")) return true;

        char[] chars = s.toCharArray();


        Stack<Character> stack = new Stack<Character>();
        Map<Character,Character> map = new HashMap<Character,Character>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for(int i=0;i<s.length();i++ ){
            if(!map.containsKey(chars[i])){
                stack.push(chars[i]);
            }else{
                if(stack.empty()
                        || map.get(chars[i]) != stack.pop()){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
