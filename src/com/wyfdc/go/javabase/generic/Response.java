package com.wyfdc.go.javabase.generic;

/**
 * @Author: hello
 */
public class Response {

  private int code;

  private String msg;

  public Response() {
  }

  public Response(int code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  public int getCode() {
    return code;
  }

  public String getMsg() {
    return msg;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
