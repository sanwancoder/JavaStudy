package com.wyfdc.go.javabase.thread.reentrant;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author
 *
 *
 *
 */
public class Test1 {

  /**
   * 线程出现死锁情况（主线程lock加锁两次，但是解锁一次），run后不会自动结束
   * @param args
   * @throws InterruptedException
   */

  //输出结果
  /**
   * "C:\Program Files\Java\jdk\bin\java.exe" -Dvisualvm.id=45455947303777 "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.1\lib\idea_rt.jar=52814:C:\Program Files\JetBrains\IntelliJ IDEA 2019.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk\jre\lib\charsets.jar;C:\Program Files\Java\jdk\jre\lib\deploy.jar;C:\Program Files\Java\jdk\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk\jre\lib\javaws.jar;C:\Program Files\Java\jdk\jre\lib\jce.jar;C:\Program Files\Java\jdk\jre\lib\jfr.jar;C:\Program Files\Java\jdk\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk\jre\lib\jsse.jar;C:\Program Files\Java\jdk\jre\lib\management-agent.jar;C:\Program Files\Java\jdk\jre\lib\plugin.jar;C:\Program Files\Java\jdk\jre\lib\resources.jar;C:\Program Files\Java\jdk\jre\lib\rt.jar;D:\IdeaProjects\github\JavaStudy\out\production\JavaStudy;D:\IdeaProjects\github\JavaStudy\lib\fastjson-1.2.54.jar;D:\IdeaProjects\github\JavaStudy\lib\cglib-3.2.6.jar" com.wyfdc.go.javabase.thread.reentrant.Test1
   * realse one once
   * @param args
   * @throws InterruptedException
   */
  public static void main(String[] args) throws InterruptedException {
    final ReentrantReadWriteLock  lock = new ReentrantReadWriteLock ();
    Thread t = new Thread(new Runnable() {
      @Override
      public void run() {
        lock.writeLock().lock();
        System.out.println("Thread real execute");
        lock.writeLock().unlock();
      }
    });

    lock.writeLock().lock();
    lock.writeLock().lock();
    t.start();
    Thread.sleep(200);

    System.out.println("realse one once");
    lock.writeLock().unlock();
  }

}