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
            obj = proceedingJoinPoint.proceed();
            return obj ;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return  null ;
    }
}
