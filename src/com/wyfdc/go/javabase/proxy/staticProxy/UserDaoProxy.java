package com.wyfdc.go.javabase.proxy.staticProxy;

public class UserDaoProxy  implements IUserDao{

    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("static 开启事务");//扩展了额外功能
        target.save();
        System.out.println("static 提交事务");
    }
}
