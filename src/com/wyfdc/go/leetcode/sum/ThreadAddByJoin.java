package com.wyfdc.go.leetcode.sum;

/**
 * @Author:
 */
public class ThreadAddByJoin {

  private static int sum = 0;

  public static final Object Lock = new Object();


  public static void main(String[] args) throws InterruptedException {

    ThreadAddByJoin threadAddByJoin = new ThreadAddByJoin();

    ThreadJoin thread1 = threadAddByJoin.new ThreadJoin(1,25);
    ThreadJoin thread2 = threadAddByJoin.new ThreadJoin(26,50);
    ThreadJoin thread3 = threadAddByJoin.new ThreadJoin(51,75);
    ThreadJoin thread4 = threadAddByJoin.new ThreadJoin(76,100);

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();


    thread1.join();
    thread2.join();
    thread3.join();
    thread4.join();

    System.out.println("sum: " + sum);

  }

  class ThreadJoin extends Thread{

    private int begin;
    private int end;

    public ThreadJoin(int begin,int end){
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
      System.out.println(Thread.currentThread().getName()+ "sum: " + sum);

    }
  }

}
