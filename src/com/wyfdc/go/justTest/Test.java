package com.wyfdc.go.justTest;

import com.alibaba.fastjson.JSONObject;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.wyfdc.go.entity.Student;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @Author:
 */
public class Test {

  public static void main(String[] args) {

    String s = "111_2223_11";

    int i = s.indexOf("_");
    System.out.println(i);
    int ii = s.indexOf("_",3+1);
    System.out.println(ii);
    System.out.println(s.substring(0,i));
    System.out.println(s.substring(0,ii));

//    System.out.println(pattern("1111222_22","_"));
    System.out.println("=============================");
    List<String> l = new ArrayList<>();
    l.add("18_21");
    l.add("18_20");
    l.add("18");
    l.add("18_20_22");
    List<String> ll = l.stream().sorted().collect(Collectors.toList());
//    ll.stream().forEach(x->{
//      System.out.println(x);
//    });
  }

  /**
   * 通过正则表达式的方式获取字符串中指定字符的个数
   * @param text 指定的字符串
   * @return 指定字符的个数
   */
  private static int pattern(String text,String p) {
    // 根据指定的字符构建正则
    Pattern pattern = Pattern.compile(p);
    // 构建字符串和正则的匹配
    Matcher matcher = pattern.matcher(text);
    int count = 0;
    // 循环依次往下匹配
    while (matcher.find()){ // 如果匹配,则数量+1
      count++;
    }
    return  count;
  }




}
