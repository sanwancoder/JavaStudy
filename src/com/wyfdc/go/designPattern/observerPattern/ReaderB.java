package com.wyfdc.go.designPattern.observerPattern;

/**
 * @Author: wuqing
 */
public class ReaderB implements Observer {

  @Override
  public void update(Object object) {
    System.out.println("我是读者B,我收到了新书:" + object);
  }

}
