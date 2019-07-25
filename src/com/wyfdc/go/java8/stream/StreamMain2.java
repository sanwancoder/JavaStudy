package com.wyfdc.go.java8.stream;

import com.alibaba.fastjson.JSON;
import com.wyfdc.go.entity.Student;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @Author:
 */
public class StreamMain2 {

  public static void main(String[] args) {
//    List<String> list = Arrays.asList("abc", "sssssss", "bc", "efg", "abcd","", "jkl");
//    List<Integer> nums = Arrays.asList(3,1,5,2,9,8,4,10,6,7);
//    nums.sort(Comparator.reverseOrder()); //reverseOrder倒序
//    System.err.println("倒序:"+nums);
//
//    nums.sort(Comparator.naturalOrder()); //naturalOrder自然排序即：正序
//    System.err.println("正序:"+nums);
//    System.out.println(nums);
    Random random = new Random();

    List<Student> studentList = new ArrayList<>();

    for(int i=0;i<20;i++){
      Student student = new Student();
      student.setId(random.nextInt(1000));
      student.setName(Integer.toString(i));
      studentList.add(student);
    }

    for (Student student:studentList) {
      System.out.println(JSON.toJSONString(student));
    }

    studentList.stream().sorted(Comparator.comparing(Student::getId).reversed());

    List<Student> l =  studentList.stream().sorted(Comparator.comparing(Student::getId)).collect(
        Collectors.toList());

    System.out.println("=============================================");

    for (Student student:studentList) {
      System.out.println(JSON.toJSONString(student));
    }

    System.out.println("=============================================");


    for (Student student:l) {
      System.out.println(JSON.toJSONString(student));
    }

  }

}
