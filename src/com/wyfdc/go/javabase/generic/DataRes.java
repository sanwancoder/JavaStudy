package com.wyfdc.go.javabase.generic;


public class DataRes extends Response {

  private Double data;

  public DataRes(Double d) {
    this.data = d;
  }

  public Double getData() {
    return data;
  }

  public void setData(Double data) {
    this.data = data;
  }
}
