package com.wyfdc.go.javabase.createJavaObject;

/**
 * @Author: hello
 */
public class UserDTO implements Cloneable {

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  private String userName;

  private String userId;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserDTO(String userName, String userId) {
    this.userName = userName;
    this.userId = userId;
  }

  public UserDTO() {
  }


}
