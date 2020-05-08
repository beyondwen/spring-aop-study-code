package com.wenhao.aopstudycode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringAopStudyCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopStudyCodeApplication.class, args);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

}
