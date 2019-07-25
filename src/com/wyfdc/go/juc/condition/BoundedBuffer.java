package com.wyfdc.go.juc.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 模拟缓冲区
 */
public class BoundedBuffer {

    private static final int DEFAULT_LENGTH = 5;
    final Lock lock = new ReentrantLock();
    final Condition notFull = lock.newCondition();
    final Condition notEmpty = lock.newCondition();

    final Object[] items = new Object[DEFAULT_LENGTH];

    int putptr=0,takeptr=0,count=0;

    public void put(Object o) throws InterruptedException{
        lock.lock(); //获取锁
        try{
            //满了
            while (items.length==count){
                notFull.await();  //释放掉锁 让其他线程执行
            }
            // 将x添加到缓冲中
            items[putptr] = o;
            // 将“put统计数putptr+1”；如果“缓冲已满”，则设putptr为0。
            if (++putptr == items.length) putptr = 0;
            count++;
            //唤醒take线程
            notEmpty.signal();
            System.out.println(Thread.currentThread().getName()+" put "+o);
        }finally {
            lock.unlock();
        }
    }

    public Object take() throws InterruptedException{
        lock.lock();    //获取锁
        try {
            // 如果“缓冲为空”，则等待；直到“缓冲”不为空，才将x从缓冲中取出。
            while (count == 0)
                notEmpty.await();  //释放掉锁 让其他线程执行
            // 将x从缓冲中取出
            Object x = items[takeptr];
            // 将“take统计数takeptr+1”；如果“缓冲为空”，则设takeptr为0。
            if (++takeptr == items.length) takeptr = 0;
            // 将“缓冲”数量-1
            --count;
            // 唤醒put线程，因为put线程通过 notFull.await()等待
            notFull.signal();
            // 打印取出的数据
            System.out.println(Thread.currentThread().getName() + " take "+ (Integer)x);
            return x;
        } finally {
            lock.unlock();    // 释放锁
        }
    }


}
