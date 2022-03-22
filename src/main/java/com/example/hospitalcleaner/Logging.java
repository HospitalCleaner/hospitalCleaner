package com.example.hospitalcleaner;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {


    @Before(value = "execution(* com.example.hospitalcleaner.business.service.impl.BossServiceImpl.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Before method:" + joinPoint.getSignature());
        System.out.println("loading...");
        //System.out.println("Creating Employee with name - " + name + " and id - " + empId);
    }

}
