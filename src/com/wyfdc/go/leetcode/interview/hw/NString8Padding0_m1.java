package com.wyfdc.go.leetcode.interview.hw;

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
public class NString8Padding0_m1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = new String(sc.nextLine());
            String[] systemIn = s.split(" ");
            List<String> res = new ArrayList<>();
            for (int i = 1; i < systemIn.length; i++) {
                String item = systemIn[i];
                if (item.length() % 8 != 0) {
                    item = item + "00000000";
                }
                while (item.length() >= 8) {
                    String sub = item.substring(0, 8);
                    res.add(sub);
                    item = item.substring(8);
                }
            }
            Collections.sort(res);
//            System.out.println(res);
            res.forEach(x -> {
                System.out.print(x + " ");
            });
        }
    }


}
