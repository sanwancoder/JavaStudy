package com.wyfdc.go.javabase.generic;

/**
 * @Author: hello
 */
public  class GenResponse {

  public static <T extends Response> Response getOK(T t){
    t.setCode(0);
    t.setMsg("success");
    return t;
  }

}
