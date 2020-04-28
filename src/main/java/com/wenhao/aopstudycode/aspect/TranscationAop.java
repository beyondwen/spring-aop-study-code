package com.wenhao.aopstudycode.aspect;

import com.wenhao.aopstudycode.utils.TranscationUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;

@Aspect
@Component
@EnableAspectJAutoProxy
public class TranscationAop {

    @Autowired
    private TranscationUtil transcationUtil;

    @Pointcut("execution(* com.wenhao.aopstudycode.service.UserService.*(..))")
    public void transcationRecAop() {
        System.out.println("切入点");
    }


    @Around("transcationRecAop()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        TransactionStatus begin = transcationUtil.begin();
        try {
            System.out.println("环绕通知aop执行方法之前");
            joinPoint.proceed();
            System.out.println("环绕通知aop执行方法之后");
            transcationUtil.commit(begin);
        }catch (Exception e){
            transcationUtil.rollBack(begin);
        }
    }


}
