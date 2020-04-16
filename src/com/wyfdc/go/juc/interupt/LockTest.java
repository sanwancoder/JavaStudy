package com.wyfdc.go.juc.interupt;

/**
 * lockInterruptibly()允许在等待时由其他线程的Thread.interrupt()方法来中断等待线程而直接返回，
 * 这时是不用获取锁的，而会抛出一个InterruptException。
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    private Lock lock = new ReentrantLock();

    public void doBussiness() {
        String name = Thread.currentThread().getName();

        try {
            System.out.println(name + " 开始获取锁");
            lock.lockInterruptibly();
            System.out.println(name + " 得到锁");
            System.out.println(name + " 开工干活");
            for (int i=0; i<5; i++) {
                Thread.sleep(1000);
                System.out.println(name + " : " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " 被中断");
            System.out.println(name + " 做些别的事情");
        } finally {
            try {
                lock.unlock();
                System.out.println(name + " 释放锁");
            } catch (Exception e) {
                System.out.println(name + " : 没有得到锁的线程运行结束");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        LockTest lockTest = new LockTest();

        Thread t0 = new Thread(
                new Runnable() {
                    public void run() {
                        lockTest.doBussiness();
                    }
                },"线程t0"
        );

        Thread t1 = new Thread(
                new Runnable() {
                    public void run() {
                        lockTest.doBussiness();
                    }
                },"线程t1"
        );

        // 启动线程t1
        t0.start();
        Thread.sleep(10);
        // 启动线程t2
        t1.start();
        Thread.sleep(100);
        // 线程t1没有得到锁，中断t1的等待
        t1.interrupt();
    }
}
