package com.wyfdc.go.juc.threadlocal;

/**
 * https://www.jianshu.com/p/94ba4a918ff5
 *
 * https://www.jianshu.com/p/3bb70ae81828
 */
public class InheritableThreadLocalTest {
    public static InheritableThreadLocal<String> threadLocal = new InheritableThreadLocal<>();

    public static String get() {
        return threadLocal.get();
    }

    public static void set(String value) {
        threadLocal.set(value);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            final int j = i;
            InheritableThreadLocalTest.set("ye");
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + ":" + InheritableThreadLocalTest.get());
                }
            });

            t.start();
        }
    }
}


