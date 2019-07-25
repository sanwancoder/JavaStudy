package com.wyfdc.go.javabase.serialization;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Student {

  private String id;
  private String name;
  private String classID;
  private transient String from;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getClassID() {
    return classID;
  }

  public void setClassID(String classID) {
    this.classID = classID;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }
}
