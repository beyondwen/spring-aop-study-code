package com.wenhao.aopstudycode;

import com.wenhao.aopstudycode.config.MyConfig;
import com.wenhao.aopstudycode.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.addOrder();
    }
}
