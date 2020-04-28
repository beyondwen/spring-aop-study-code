package com.wenhao.aopstudycode.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.wenhao.aopstudycode.service","com.wenhao.aopstudycode.aspect"})
public class MyConfig {

}
