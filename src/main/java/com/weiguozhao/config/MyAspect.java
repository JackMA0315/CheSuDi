package com.weiguozhao.config;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* *.*.service.impl.*.*(..))")
    public void pt1(){}
    @Around("pt1()")
    public Object myround(ProceedingJoinPoint proceedingJoinPoint){
        Object obj = null ;
        try{
            System.out.println("MyAspect类执行前置通知");
            obj = proceedingJoinPoint.proceed();
            System.out.println("MyAspect类执行后置通知");
            return obj ;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return  null ;
    }
}
