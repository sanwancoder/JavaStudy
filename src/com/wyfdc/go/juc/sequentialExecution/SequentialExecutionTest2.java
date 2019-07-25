package com.wyfdc.go.juc.sequentialExecution;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SequentialExecutionTest2 {
    private static Lock lock = new ReentrantLock();
    private static int state = 0;

    class ThreadA extends Thread {
        @Override
        public void run() {
            lock.lock();
            if (state % 3 == 0) {
                System.out.println("A");
                state++;
            }
            lock.unlock();
        }
    }

    class ThreadB extends Thread {
        @Override
        public void run() {
            lock.lock();
            if (state % 3 == 1) {
                System.out.println("B");
                state++;
            }
            lock.unlock();
        }

    }

    class ThreadC extends Thread {
        @Override
        public void run() {
            lock.lock();
            if (state % 3 == 2) {
                System.out.println("C");
                state++;
            }
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        SequentialExecutionTest2 test2 = new SequentialExecutionTest2();
        new Thread(test2.new ThreadA()).start();
        new Thread(test2.new ThreadB()).start();
        new Thread(test2.new ThreadC()).start();
    }

}

