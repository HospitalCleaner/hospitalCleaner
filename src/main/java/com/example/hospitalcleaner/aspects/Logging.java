package com.example.hospitalcleaner.aspects;

import com.example.hospitalcleaner.business.core.results.DataResult;
import com.example.hospitalcleaner.business.dto.BossEntityDto;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

@Aspect
@Component
public class Logging {
    double milis;

   /* @Pointcut()
    public void abc(){}
*/

    @Before(value = "execution(* com.example.hospitalcleaner.business.service.impl.*.*(..))")
    public void beforeAdvice() {
        System.out.println("Before method:" + getClass().getName());
        System.out.println("loading...");
        milis=System.currentTimeMillis();
        //System.out.println("Creating Employee with name - " + name + " and id - " + empId);
    }

    /*@AfterReturning(value = "execution(* com.example.hospitalcleaner.business.service.impl.*.*(..))",returning = "result")
    public void writeResult(JoinPoint joinPoint, DataResult result) throws ClassNotFoundException,InstantiationException,IllegalAccessException,IllegalArgumentException, InvocationTargetException {
        //System.out.println(System.currentTimeMillis());

        Class cls = Class.forName("com.example.hospitalcleaner.business.dto.BossEntityDto");
        Object obj = cls.newInstance();
        Constructor[] constructors= cls.getConstructors();
        Field[] fields=cls.getFields();
        Method[] methods=cls.getDeclaredMethods();
        System.out.println(cls);



        for(Method method : methods){
            //System.out.println(method.getGenericReturnType());
            //System.out.println(field.getName());

            System.out.println("Method ismi : " +method.getName() +"\n"+
                    "Method Dönüş Tipi : "+ method.getReturnType());


            Class cls2=Class.forName(method.getReturnType().getName());

        }

        System.out.println((System.currentTimeMillis()-milis));
        System.out.println(result.getData().toString());
        System.out.println(joinPoint.getTarget());

    }*/
   /* @Around(value = "execution(* com.example.hospitalcleaner.business.service.impl.*.*(..))")
    public Object performance(ProceedingJoinPoint joinPoint)throws Throwable {
        long start=System.currentTimeMillis();
        Object result= joinPoint.proceed();
        long finish=System.currentTimeMillis();
        System.out.println(finish-start);
        return result;
    }*/



}
