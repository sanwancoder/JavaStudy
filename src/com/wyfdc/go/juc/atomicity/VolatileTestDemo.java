package com.wyfdc.go.juc.atomicity;

public class VolatileTestDemo {
    public static volatile int _longVal = 0;

    private static int NUM = 10000000;

    public static void main(String[] args) {

        Thread t1 = new Thread(new LoopVolatile());
        t1.start();

        Thread t2 = new Thread(new LoopVolatile());
        t2.start();


        while (t1.isAlive() || t2.isAlive()) {
        }
        // 期待 2000000
        System.out.println("final val is: " + _longVal);

        System.out.println("\nvolatile不具有原子性 \n");


    }


    private static class LoopVolatile implements Runnable {
        public void run() {
            long val = 0;
            while (val < NUM) {
                _longVal++;
                val++;
            }
        }
    }

}
