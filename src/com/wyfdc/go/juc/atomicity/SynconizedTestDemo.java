package com.wyfdc.go.juc.atomicity;

/**
 * ????
 */
public class SynconizedTestDemo {

    public static int NUM = 10000000;

    public static int _count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
           Thread t = new Thread(new AddThread());
           t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(_count);
        System.out.println("\nsynchronized具有原子性和可见性");
    }


    static class AddThread extends Thread {

        public synchronized void run() {
            int i = 0;
            while (i < NUM) {
                _count++;
                i++;
            }
        }
    }
}
