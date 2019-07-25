package com.wyfdc.go.om;

import com.wyfdc.go.unsafe.UnsafeUtils;
import sun.misc.Unsafe;

public class DirectMemoryOOMTest {
    private static int i = 0;
    public static void main(String[] args) {

        try {
            Unsafe unsafe = UnsafeUtils.getUnsafe();
            for (; ; ) {
                unsafe.allocateMemory(1024 * 1024L);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("分配次数: "+i);
        }

    }
}
