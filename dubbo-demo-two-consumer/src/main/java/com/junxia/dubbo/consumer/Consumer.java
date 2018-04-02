package com.junxia.dubbo.consumer;

import com.junxia.dubbo.service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/dubbo-demo-consumer.xml"});
        context.start();

        TestService testService = (TestService) context.getBean("testService");
        String names [] = {"张三","李四","王五","赵六"};
        for(String name : names){
            String result = testService.helloWorld(name);
            System.out.println(result);
            Thread.sleep(1000);
        }
    }
}
