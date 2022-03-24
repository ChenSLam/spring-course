package com.bjpowernode.handler;

import com.bjpowernode.tool.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行invoke");
        System.out.println("method名称"+method.getName());
        Object res;
        if ("doSome".equals(method.getName())){
            ServiceTools.doLog();
            res = method.invoke(target, args);
            ServiceTools.doSub();
        }else {
            res = method.invoke(target, args);
        }

        return res;

    }
}
