package com.wyfdc.go.javabase.thread.future;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author:
 */
public class CallableAndFuture1 {

  public static void main(String[] args) {
    Callable<Integer> callable = new Callable<Integer>() {

      @Override
      public Integer call() throws Exception {
        return new Random().nextInt(100);
      }

    };
    FutureTask<Integer> future = new FutureTask<Integer>(callable);
    new Thread(future).start();
    try {
      Thread.sleep(5000);
      System.out.println(future.get());
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }

}
