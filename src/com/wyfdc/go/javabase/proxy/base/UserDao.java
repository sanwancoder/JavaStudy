package com.wyfdc.go.javabase.proxy.base;

public class UserDao implements IUserDao {

	@Override
	public void save() {
		System.out.println("数据保存");
	}

}
