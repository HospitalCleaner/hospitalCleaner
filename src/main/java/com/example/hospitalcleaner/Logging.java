package com.example.hospitalcleaner;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@Aspect
@Component
public class Logging {

   /* @Pointcut()
    public void abc(){}
*/

    @Before(value = "execution(* com.example.hospitalcleaner.business.service.impl.*.*(..))")
    public void beforeAdvice() {
        System.out.println("Before method:" + getClass().getName());
        System.out.println("loading...");
        //System.out.println("Creating Employee with name - " + name + " and id - " + empId);
    }

    @AfterReturning(value = "execution(* com.example.hospitalcleaner.business.service.impl.*.*(..))",returning = "result")
    public void writeResult(JoinPoint joinPoint,Object result){
        System.out.println(result);
    }

}
