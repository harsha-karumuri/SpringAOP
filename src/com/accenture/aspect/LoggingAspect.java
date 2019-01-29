package com.accenture.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	
	@Pointcut("execution(* com.accenture.controller.HelloWorldController.sayHello(..))")
	public void sayHelloPointCut() {
		
	}
	
	
	@Before(value="")
	public void loggIn(JoinPoint jp) {
		
		long startTime = System.currentTimeMillis();
		System.out.println("LoggingAspect-loggIn"+jp.getSignature().getName()+"   "+startTime);
	}
	
}
