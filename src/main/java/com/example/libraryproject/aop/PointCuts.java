package com.example.libraryproject.aop;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PointCuts {

    @Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
    public void controllerPointCut()
    {

    }
}
