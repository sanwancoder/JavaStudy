package com.wyfdc.go.javabase.thread.threadlocal.example1;

/**
 * @Author:  
 */
public class TestMain {

  public static void main(String[] args) {
    TestNum sn = new TestNum();
    // ③ 3个线程共享sn，各自产生序列号  
    TestClientThread t1 = new TestClientThread(sn);
    TestClientThread t2 = new TestClientThread(sn);
    TestClientThread t3 = new TestClientThread(sn);
    t1.start();
    t2.start();
    t3.start();
  }

}
