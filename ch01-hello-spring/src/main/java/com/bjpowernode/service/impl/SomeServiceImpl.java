package com.bjpowernode.service.impl;

import com.bjpowernode.service.SomeService;

public class SomeServiceImpl implements SomeService{
    public SomeServiceImpl() {
        System.out.println("无参数");
    }

    @Override
    public void doSome() {
        System.out.println("直接实现");
    }
}
