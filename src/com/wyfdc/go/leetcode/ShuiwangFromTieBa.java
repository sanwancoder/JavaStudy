package com.wyfdc.go.leetcode;

public class ShuiwangFromTieBa {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 2, 5, 5, 5, 5, 5, 5, 5,4};
        System.out.println(findShuiwang(a));
    }

    /**
     * 步骤：
     * <p>
     * 1. 可以假设帖子的第一个ID是次数最大的，用candidate记录，次数用nTimes记录。
     * <p>
     * 2. 遍历下一个ID，如果跟candidate一样，nTimes++，否则，遇到一个挑战，则nTimes--，如果nTimes == 0，下一步就要重复第一步了。
     * <p>
     * 3.遍历结束，nTimes>0的那个candidate就是水王ID，他是获胜者。
     * ————————————————
     * 版权声明：本文为CSDN博主「rein07」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
     * 原文链接：https://blog.csdn.net/rein07/java/article/details/6741661
     *
     * @param arrs
     * @return
     */
    public static int findShuiwang(int[] arrs) {
        int length = arrs.length;
        int candidate = 0;
        int nTimes, i;
        for (i = nTimes = 0; i < length; i++) {
            if (nTimes == 0) {
                candidate = arrs[i];
                nTimes = 1;
            } else {
                if (candidate == arrs[i])
                    nTimes++;
                else
                    nTimes--;

            }

        }
        return candidate;
    }

}
