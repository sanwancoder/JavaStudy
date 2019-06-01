package com.wyfdc.go.javabase.proxy.jdkProxy;

import com.wyfdc.go.javabase.proxy.base.IUserDao;
import com.wyfdc.go.javabase.proxy.base.UserDao;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;



public class UserDaoJdkProxy {
	
	
	private Object target;
	
	public UserDaoJdkProxy(Object target) {
		this.target = target;
	}
	
	
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				System.out.println("开启事务");
				Object returnValue = method.invoke(target, args);
				System.out.println("关闭事务");
				return returnValue;
			}
		});
	}
	
	public static void main(String[] args) {
		
		IUserDao target = new UserDao();
		System.out.println(target.getClass());
		IUserDao proxy = (IUserDao) new UserDaoJdkProxy(target).getProxyInstance();
		System.out.println(proxy.getClass());
		proxy.save();
		
	}
	

}
