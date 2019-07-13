package com.wyfdc.go.javabase.createXML.method2annotation.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @Author:
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CityProvinceDTO {

  @XmlElement(name = "City")
  private String city = "wuhan";

  @XmlElement(name = "Province")
  private String province = "hubei";

  public CityProvinceDTO(String city, String province) {
    this.city = city;
    this.province = province;
  }

  public CityProvinceDTO() {
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }
}
