package com.wyfdc.go.entity;

/**
 * @Author:
 */
public class Student {

  private String name;

  private Integer id;

  public Student(String name, Integer id) {
    this.name = name;
    this.id = id;
  }

  public Student() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
