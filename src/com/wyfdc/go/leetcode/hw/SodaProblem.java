package com.wyfdc.go.leetcode.hw;

import java.util.Scanner;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/fe298c55694f4ed39e256170ff2c205f
 * 来源：牛客网
 *
 * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”
 * 答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
 * 然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 *
 *
 * 输入文件最多包含10组测试数据，每个数据占一行，仅包含一个正整数n（1<=n<=100），
 * 表示小张手上的空汽水瓶数。n=0表示输入结束，你的程序不应当处理这一行。
 *
 */
public class SodaProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            if (t != 0) {
                System.out.println(t / 2);  //每两瓶喝一瓶 直接除即可
            }
        }
    }

}
