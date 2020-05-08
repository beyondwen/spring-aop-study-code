package com.wenhao.aopstudycode;

import com.wenhao.aopstudycode.config.MyConfig;
import com.wenhao.aopstudycode.service.OrderServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        OrderServiceImpl orderServiceImpl = applicationContext.getBean("orderServiceImpl", OrderServiceImpl.class);
        orderServiceImpl.addOrder();
    }
}
