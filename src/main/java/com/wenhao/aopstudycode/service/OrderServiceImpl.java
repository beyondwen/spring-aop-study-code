package com.wenhao.aopstudycode.service;

import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {


    public void addOrder() {
        System.out.println("addOrder方法》》》》》");
        int x = 1 / 0;
    }
}
