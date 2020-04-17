package com.wyfdc.go.javabase.proxy.staticProxy;

public class StaticProxyTest {

    public static void main(String[] args) {
        //目标对象
        IUserDao target = new UserDao();
        //代理对象
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();
    }
}
