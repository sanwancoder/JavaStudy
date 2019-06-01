package com.wyfdc.go.javabase.proxy.staticproxy;


import com.wyfdc.go.javabase.proxy.base.IUserDao;
import com.wyfdc.go.javabase.proxy.base.UserDao;

/**
 *     静态代理对象
 * @author hello
 *
 */
public class UserDaoStaticProxy implements IUserDao {
	
	private IUserDao target;
	
	public UserDaoStaticProxy(IUserDao userDao){
		this.target = userDao;
	}
	
	@Override
	public void save() {
		System.out.println("开启事务");
		target.save();
		System.out.println("关闭事务");
	}
	
	
	public static void main(String args[]) {
		IUserDao iUserDao = new UserDao();
		UserDaoStaticProxy userDaoStaticProxy = new UserDaoStaticProxy(iUserDao);
		userDaoStaticProxy.save();
	}

}
