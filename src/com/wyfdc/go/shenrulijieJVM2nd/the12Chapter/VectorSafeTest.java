package com.wyfdc.go.shenrulijieJVM2nd.the12Chapter;

import java.util.Vector;

/**
 * @Author:
 */
public class VectorSafeTest {

  private static Vector<Integer> vector = new Vector<>();

  public static void main(String[] args) {
    while (true){
      for (int i = 0; i < 10; i++){
        vector.add(i);
      }

      Thread removeThread = new Thread(new Runnable() {
        @Override
        public void run() {
          for (int i = 0 ; i < 10 ; i++){
            vector.remove(i);
          }
        }
      });

      Thread printThread = new Thread(new Runnable() {
        @Override
        public void run() {
          for(int i = 0; i < vector.size();i++){
            System.out.println(Thread.currentThread().getName() + " " +vector.get(i) );
          }
        }
      });

      removeThread.start();
      printThread.start();

      while(Thread.activeCount() > 20){};

    }
  }


}
