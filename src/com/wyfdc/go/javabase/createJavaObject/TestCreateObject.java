package com.wyfdc.go.javabase.createJavaObject;

/**
 * @Author: hello
 */
public class TestCreateObject {

  public static void main(String[] args) throws  Exception {

    //method1
    UserDTO userDTO = new  UserDTO();

    System.out.println("userDTO: " + userDTO);

    //method2
    UserDTO userDTO2 = (UserDTO)Class.forName("com.wyfdc.go.javabase.createJavaObject.UserDTO").newInstance();

    System.out.println("userDTO2: " + userDTO2);


    UserDTO userDTO3 = UserDTO.class.newInstance();

    System.out.println("userDTO3: " + userDTO3);


    //method3 clone
    UserDTO userDTO4 = (UserDTO)userDTO2.clone();

    System.out.println("userDTO4: " + userDTO4);

     //序列化


  }

}
