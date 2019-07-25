package com.wyfdc.go.javabase.serialization;

import com.alibaba.fastjson.JSON;

/**
 * @Author:
 */
public class Test01 {

  public static void main(String[] args) {
    String s = "Hello World";
    System.out.println(JSON.toJSONString(s));
  }

}
