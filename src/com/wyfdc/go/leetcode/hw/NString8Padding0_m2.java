package com.wyfdc.go.leetcode.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 输入字符串  对每个字符串 每8个字符进行拆分；不足8个的进行拆分 并排序输出
 * <p>
 * 示例： 输入：2 abc  123456789
 * 输出：12345678 90000000 abc00000
 */
public class NString8Padding0_m2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = new String(sc.nextLine());
            String[] systemIn = s.split(" ");
            List<String> list = new ArrayList<>();
            for (int i = 1; i < systemIn.length; i++) {
                String item = systemIn[i];
                int length = item.length();
                if (length <= 8) {
                    list.add(padding0(item));
                } else {
                    int q = 0;
                    for (q = 0; q < length / 8; q++) {
                        //length =9 ;0~8
                        list.add(item.substring(q * 8, (q + 1) * 8));
                    }
                    if (length % 8 != 0) {
                        // 8 ~ 9
                        list.add(padding0(item.substring(q * 8, length)));
                    }
                }
            }
            Collections.sort(list);
            list.forEach(x -> {
                System.out.print(x + " ");
            });
        }
    }

    private static String padding0(String str) {
        int len = str.length();
        int l = 8 - len;
        StringBuffer buff = new StringBuffer();
        for (int i = 0; i < l; i++) {
            buff.append("0");
        }
        return str + buff.toString();
    }


}
