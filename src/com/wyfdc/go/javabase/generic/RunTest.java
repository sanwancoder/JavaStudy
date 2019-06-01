package com.wyfdc.go.javabase.generic;

import com.alibaba.fastjson.JSONObject;


/**
 * @Author: hello
 */
public class RunTest {

  public static void main(String[] args) {

    Class clazz = com.wyfdc.go.javabase.generic.Response.class;

    Response response = null;
    try {
      response = (Response) clazz.newInstance();
    } catch (Exception e) {
      e.printStackTrace();
    }finally {
      System.out.println(JSONObject.toJSONString(response));
    }

    Double d = 1.00;

    DataRes res = new DataRes(d);

    Response r = GenResponse.getOK(res);

    System.out.println(JSONObject.toJSONString(r));

  }

}
