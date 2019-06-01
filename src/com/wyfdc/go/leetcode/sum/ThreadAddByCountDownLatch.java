package com.wyfdc.go.leetcode.sum;

import java.util.concurrent.CountDownLatch;

/**
 * @Author:
 */
public class ThreadAddByCountDownLatch {

  private static int sum = 0;

  public static final Object Lock = new Object();

  private static CountDownLatch countDownLatch = new CountDownLatch(4);

  public static void main(String[] args) throws InterruptedException {
    ThreadAddByCountDownLatch threadAddByCountDownLatch = new ThreadAddByCountDownLatch();
    ThreadJoin thread1 = threadAddByCountDownLatch.new ThreadJoin(1,25);
    ThreadJoin thread2 = threadAddByCountDownLatch.new ThreadJoin(26,50);
    ThreadJoin thread3 = threadAddByCountDownLatch.new ThreadJoin(51,75);
    ThreadJoin thread4 = threadAddByCountDownLatch.new ThreadJoin(76,100);

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();

    countDownLatch.await();   //挂起来

    System.out.println("sum: " + sum);


  }


  class ThreadJoin extends Thread {

    private int begin;
    private int end;

    public ThreadJoin(int begin, int end) {
      this.begin = begin;
      this.end = end;
    }

    @Override
    public void run() {
      synchronized (Lock) {
        for (int i = begin; i <= end; i++) {
          sum += i;
        }
      }
      countDownLatch.countDown();
      System.out.println(Thread.currentThread().getName() + "sum: " + sum);
    }
  }

}
