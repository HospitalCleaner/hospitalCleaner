package com.example.hospitalcleaner.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class GiveMessageAspect {
    @After("@annotation(com.example.hospitalcleaner.customAnnotations.Performance)")
    public void giveMessage() {
       /* long start=System.currentTimeMillis();
        Object result= joinPoint.proceed();
        long elapsedTime=System.currentTimeMillis()-start;*/
        System.out.println("Congratulations..");
        //return result;
    }
}
