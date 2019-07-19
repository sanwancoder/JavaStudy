package com.wyfdc.go.designPattern.observerPattern;

/**
 * @Author: wuqing
 */
public class ReaderA implements Observer {

  @Override
  public void update(Object object) {
    System.out.println("我是读者A,我收到了新书:" + object);
  }
}
