package com.wenhao.aopstudycode.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LogAop {

    @Pointcut("execution(* com.wenhao.aopstudycode.service.OrderServiceImpl.*(..))")
    public void logRecAop() {
        System.out.println("切入点");
    }

    @Before("logRecAop()")
    public void doBefore() {
        System.out.println("前置aop");
    }

    @After("logRecAop()")
    public void doAfter() {
        System.out.println("后置aop");
    }

    @AfterReturning("logRecAop()")
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println("运行通知aop");
    }

    @AfterThrowing("logRecAop()")
    public void afterThrowing() {
        System.out.println("异常通知aop");
    }

    @Around("logRecAop()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知aop执行方法之前");
        joinPoint.proceed();
        System.out.println("环绕通知aop执行方法之后");
    }


}
