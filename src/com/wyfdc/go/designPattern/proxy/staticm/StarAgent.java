package com.wyfdc.go.designPattern.proxy.staticm;

/**
 * 静态代理总结:
 * 优点：可以做到在不修改目标对象的功能前提下,对目标功能扩展.
 * 缺点:因为代理对象需要与目标对象实现一样的接口,
 *    所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护
 */
public class StarAgent implements IStar {

    private IStar star;

    public StarAgent(IStar s){
        super();
        this.star = s;
    }

    @Override
    public void sing() {
        System.out.println("台前准备工作");
        star.sing();
        System.out.println("演唱完离场毕灯光切换");
    }

    public static void main(String[] args) {
        IStar ldh = new LDHStar();
        StarAgent starAgent = new StarAgent(ldh);
        starAgent.sing();
    }
}
