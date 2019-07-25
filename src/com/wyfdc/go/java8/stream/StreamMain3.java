package com.wyfdc.go.java8.stream;

import com.alibaba.fastjson.JSON;
import com.wyfdc.go.entity.Student;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author:
 */
public class StreamMain3 {

  public static void main(String[] args) {
    List<Student> ll = new ArrayList<>();

    ll.add(new Student("A",111));
    ll.add(new Student("B",1151));
    ll.add(new Student("CCA",1151));
    ll.add(new Student("DDA",1151));
    ll.add(new Student("IIA",1));
    ll.add(new Student("OOPPA",16611));

    ll = sort(ll);
    ll.forEach(x->{
      System.out.println(JSON.toJSONString(x));
    });
  }

  public static List<Student> sort(List<Student> ll){
    List<Student> s = ll.stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
    return s;
  }

}
