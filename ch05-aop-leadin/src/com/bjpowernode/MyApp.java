package com.bjpowernode;

import com.bjpowernode.handler.MyInvocationHandler;
import com.bjpowernode.service.SomeService;
import com.bjpowernode.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
public class MyApp {
    public static void main(String[] args) {
        SomeService service = new SomeServiceImpl();
        InvocationHandler ic = new MyInvocationHandler(service);
        SomeService proxy = (SomeService) Proxy.newProxyInstance(service.getClass().getClassLoader(),service.getClass().getInterfaces(),ic);
        proxy.doSome();
        proxy.doOther();
    }
}
