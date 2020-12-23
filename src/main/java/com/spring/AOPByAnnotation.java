package com.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *AOP：使用注解
 */
//标记一个切面类
@Aspect
public class AOPByAnnotation {
    @Before("execution(public void com.spring.Client.test())")
    public void before(){
        System.out.println("====Before====");
    }
    @After("execution(public void com.spring.Client.test())")
    public void after(){
        System.out.println("====After====");
    }
    @Around("execution(public void com.spring.Client.test())")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("====before around====");
        Object proceed = jp.proceed();//执行方法
        System.out.println("====after around====");
    }
}
