package com.wyfdc.go.designPattern.proxy.dynamic;

public class UserDAO implements IUserDAO {


    @Override
    public void save() {
        System.out.println("-----保存成功-----");
    }
}
