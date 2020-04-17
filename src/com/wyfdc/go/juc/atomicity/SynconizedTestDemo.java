package com.wyfdc.go.juc.atomicity;

/**
 * 
 */
public class SynconizedTestDemo {

    public static int NUM = 10000000;

    public static int _count = 0;
    public static Object _object = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(new AddThread());
        Thread t2 = new Thread(new AddThread());
        Thread t3 = new Thread(new AddThread());
        Thread t4 = new Thread(new AddThread());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        while (t1.isAlive() || t2.isAlive() || t3.isAlive() || t4.isAlive()) {
        }

        System.out.println(_count);
        System.out.println("\nsynchronized具有原子性和可见性");
    }


    static class AddThread extends Thread {

        public void run() {
            synchronized (_object) {
                int i = 0;
                while (i < NUM) {
                    _count++;
                    i++;
                }
            }
        }
    }
}
