package com.wyfdc.go.juc.threadlocal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadLocalTest {
    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static String get() {
        return threadLocal.get();
    }

    public static void set(String value) {
        threadLocal.set(value);
    }

    public static void main(String[] args) {

        Map<String,Object> hashMap = Collections.synchronizedMap(new HashMap<String,Object>());

        ConcurrentHashMap<String,Object> concurrentHashMap = new ConcurrentHashMap<String,Object>();

        for (int i = 0; i < 5; i++) {
            final int j = i;
            ThreadLocalTest.set("ye");
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalTest.get());
                }
            });

            t.start();
        }
    }
}


