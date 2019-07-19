package com.wyfdc.go.designPattern.observerPattern;

import java.util.Vector;

/**
 * @Author: wuqing
 */
public abstract class Observable {
  //观察者数组
  private Vector<Observer> obVector = new Vector<>();


  //添加观察者
  public boolean addObserver(Observer observer){
    return obVector.add(observer);
  }

  //移除观察者
  public boolean removeObserver(Observer observer){
    return obVector.remove(observer);
  }

  //通知所有观察者
  public void notifyAllOberver(Book book){
    obVector.forEach(observer -> {
      observer.update(book);

    });
  }


}
