package com.example.hospitalcleaner.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class PerformanceLoggerAspect {


    @Around("@annotation(com.example.hospitalcleaner.customAnnotations.Performance)")
    public Object profile(ProceedingJoinPoint joinPoint) throws Throwable{
        long start=System.currentTimeMillis();
        Object result= joinPoint.proceed();
        long elapsedTime=System.currentTimeMillis()-start;
        System.out.println("Metod koşturma zamanı: "+elapsedTime+" miliseconds.");
        return result;
    }




}
