package com.wyfdc.go.shenrulijieJVM2nd.the12Chapter;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author:
 *
 * 结果值一定是: 200000
 *
 */
public class AtomicTest {

  public static volatile AtomicInteger race = new AtomicInteger(0);

  private static final int THREAD_COUNT = 20;

  public static void increase() {
    System.out.println(Thread.currentThread().getName() + " " + race);
    race.incrementAndGet();
  }

  public static void main(String[] args) {
    Thread[] threads = new Thread[THREAD_COUNT];

    for (int i = 0; i < THREAD_COUNT; i++) {
      Runnable target;
      threads[i] = new Thread(new Runnable() {
        @Override
        public void run() {
          for (int i = 0; i < 10000; i++) {
            increase();
          }
        }
      });
      threads[i].start();
    }

    while (Thread.activeCount() > 2) {
      Thread.yield();
    }

    System.out.println("---->>> " + race);
  }


}
