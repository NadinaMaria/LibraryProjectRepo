package com.example.libraryproject.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;



@Order(0)
@Aspect
@Configuration
public class LogAspect {
@Around(value = "com.example.libraryproject.aop.PointCuts.controllerPointCut()")
    public Object calculateLoggerTime (ProceedingJoinPoint joinPoint) throws Throwable {
        final Logger classLogger = LoggerFactory.getLogger(joinPoint.getTarget().getClass());

        String className = joinPoint.getTarget().getClass().getName();
        String methodName = ((MethodSignature)joinPoint.getSignature()).getMethod().getName();
        String methodArgs = joinPoint.getArgs().toString();
        long startTime = System.nanoTime();
        Object result = joinPoint.proceed();
        long endTime = System.nanoTime();
        long takenTime = endTime - startTime;

        LoggerMessage loggerMessage = LoggerMessage
                .builder()
                .className(className)
                .methodArgs(methodArgs)
                .methodName(methodName)
                .timeTaken(takenTime)
                .result(result)
                .build();

        classLogger.info("Aspect : " + loggerMessage);
        return result;
    }
}
