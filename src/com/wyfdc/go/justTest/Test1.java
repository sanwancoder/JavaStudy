package com.wyfdc.go.justTest;

import com.wyfdc.go.unsafe.UnsafeUtils;
import sun.misc.Unsafe;

public class Test1 {

    public static void main(String[] args) {
        System.out.println(10 >> 1);
        System.out.println(10%4);
        System.out.println(10&(4-1));
    }

    static int hash(Object key) {
        System.out.println(key.hashCode());
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }


}
