package com.wyfdc.go.javabase.threadlocal.example1;

import com.alibaba.fastjson.JSONObject;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:  
 */
public class TestNum {

  private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
    @Override
    public Integer initialValue(){
      return 0;
    }
  };

  private static ThreadLocal<Long> nowThreadLocal = new ThreadLocal<Long>();

  private static ThreadLocal<Map<String,Date>> mapThreadLocal = new ThreadLocal<Map<String,Date>>(){
    @Override
    public Map<String,Date> initialValue(){
      return new HashMap<String,Date>();
    }
  };


  public int getNextNum(){
    seqNum.set(seqNum.get()+1);
    return seqNum.get();

  }

  public long getNow(){
    nowThreadLocal.set(System.currentTimeMillis());
    return nowThreadLocal.get();
  }


  public String getString(){
    Map<String,Date> map = mapThreadLocal.get();
    map.put(Thread.currentThread().getName(),new Date());
    map.put(Long.toString(Thread.currentThread().getId()),new Date());
    return JSONObject.toJSONString(map);
  }

}
