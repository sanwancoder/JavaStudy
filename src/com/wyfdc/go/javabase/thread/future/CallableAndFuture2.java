package com.wyfdc.go.javabase.thread.future;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @Author:
 */
public class CallableAndFuture2 {

  public static void main(String[] args) {

    ExecutorService threadPool = Executors.newFixedThreadPool(1);

    Future<Integer> future = threadPool.submit(new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        return new Random().nextInt(100);
      }
    });

    try {
      Thread.sleep(5000);
      System.out.println(future.get());
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }

    threadPool.shutdown();


  }

}
