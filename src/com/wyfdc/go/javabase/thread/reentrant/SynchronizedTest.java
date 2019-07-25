package com.wyfdc.go.javabase.thread.reentrant;

/**
 * @Author:
 */
public class SynchronizedTest implements Runnable {

  private static int i = 0;
  private static int j = 0;


  @Override
  public void run() {
    synchronized (SynchronizedTest.class){
      i++;
    }
    increase();
  }

  public void increase(){
    synchronized (SynchronizedTest.class) {
      j++;
    }
  }

  /**
   * synchronized 是可重入的  monitor+1
   * @param args
   * @throws InterruptedException
   */
  public static void main(String[] args) throws InterruptedException {
    Runnable target = new SynchronizedTest();
    String name;
    Thread t = new Thread(target, "Thread1");
    Thread t2 = new Thread(target, "Thread2");
    t.start();
    t2.start();
    t.join();
    t2.join();
    System.out.println(i + " " +  j);
  }

}
