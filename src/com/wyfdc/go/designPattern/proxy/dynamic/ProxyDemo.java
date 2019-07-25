package com.wyfdc.go.designPattern.proxy.dynamic;

/**
 * https://www.cnblogs.com/qlqwjy/p/7550609.html
 */
public class ProxyDemo {

    public static void main(String[] args) {
        // 目标对象
        IUserDAO target = new UserDAO();
        // 【原始的类型 class cn.itcast.b_dynamic.UserDao】
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IUserDAO proxy = (IUserDAO) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();
    }

}
