package com.wyfdc.go.javabase.createXML.method2annotation.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @Author:
 */
@XmlRootElement(name="employee")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"id","name","sex","balance","age","dtos"})
public class People {
  @XmlElement(name="ID")
  public String id = "001";

  @XmlElement(name="Name")
  public String name = "张三";

  @XmlElement(name="Sex")
  public String sex = "男";

  @XmlElement(name="Balance")
  public double balance = 1111.22;

  @XmlElement(name="Age")
  private String age = "30";

  @XmlElementWrapper(name="Addresses")
  @XmlElement(name="Address")
  private List<CityProvinceDTO> dtos = new ArrayList<>();


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

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public List<CityProvinceDTO> getDtos() {
    return dtos;
  }

  public void setDtos(
      List<CityProvinceDTO> dtos) {
    this.dtos = dtos;
  }

  public People() {
  }

  public People(String id, String name, String sex, double balance, String age,
      List<CityProvinceDTO> dtos) {
    this.id = id;
    this.name = name;
    this.sex = sex;
    this.balance = balance;
    this.age = age;
    this.dtos = dtos;
  }
}
