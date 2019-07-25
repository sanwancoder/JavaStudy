package com.wyfdc.go.javabase.threadlocal.example1;

import java.util.concurrent.TimeUnit;

/**
 * @Author:  
 */
public class TestClientThread extends Thread {

  private TestNum testNum;

  public TestClientThread(TestNum testNum){
    this.testNum = testNum;
  }

  @Override
  public void run(){
    for (int i=0;i<3;i++){
      System.out.println(Thread.currentThread().getName() + ": " + testNum.getNextNum() + ": " + testNum.getNow() + " : " + testNum.getString());
      try {
        TimeUnit.MILLISECONDS.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }


}
