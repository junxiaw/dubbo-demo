package com.junxia.dubbo;

import com.alibaba.dubbo.rpc.RpcContext;
import com.junxia.dubbo.service.TestService;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestServiceImp implements TestService{
    public String helloWorld(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return name + "Hello World! ";
    }
}
