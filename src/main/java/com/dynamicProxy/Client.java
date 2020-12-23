package com.dynamicProxy;

//模拟动态代理
public class Client {
    public static void main(String[] args) {
        User user=new User();
        ProxyInvocationHandler pih= new ProxyInvocationHandler();
        pih.setUser(user);

        Target proxy = (Target) pih.getProxy();
        proxy.shopping();
        proxy.work();
    }
}
