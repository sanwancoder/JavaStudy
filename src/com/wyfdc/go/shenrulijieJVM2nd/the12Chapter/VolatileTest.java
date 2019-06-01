package com.wyfdc.go.shenrulijieJVM2nd.the12Chapter;

/**
 * @Author:
 *
 * 多执行几遍  会发现结果不一样的 >>> 结果值不一定是 200000
 *
 * volatile具有可见性 但不具有原子性
 *
 */
public class VolatileTest {

  public static volatile int race = 0;

  private static final int THREAD_COUNT = 20;

  public static void increase() {
    System.out.println(Thread.currentThread().getName() + " " + race);
    race++;
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
