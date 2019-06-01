package com.wyfdc.go.javabase.proxy.cglibProxy;


import com.wyfdc.go.javabase.proxy.base.UserDao;
import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class UserDaoCglibProxy implements MethodInterceptor {

	private Object target;

	public UserDaoCglibProxy(Object target) {
		this.target = target;
	}

	public Object getProxyInstance() {
		Enhancer en = new Enhancer();
		en.setSuperclass(target.getClass());
		en.setCallback(this);
		return en.create();

	}

	public static void main(String[] args) {
		
		  //目标对象 
		  UserDao target = new UserDao();
		  System.out.println(target.getClass());
		  //代理对象 
		  UserDao proxy = (UserDao) new UserDaoCglibProxy(target).getProxyInstance();
		  System.out.println(proxy.getClass()); 
		  //执行代理对象方法 
		  proxy.save();
		 
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("开启事务");
		Object returnObject = method.invoke(obj, args);
		System.out.println("关闭事务");
		return returnObject;
	}

}
